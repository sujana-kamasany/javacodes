package implementation;

import java.util.LinkedList;
public class HashMap<K, V> {
  class HashElement<K, V> implements Comparable<HashElement<K, V>> {
    K key;
    V value;

    public HashElement(K key, V value) {
      this.key = key;
      this.value = value;
    }

    public K getKey() { return key; }

    public V getValue() { return value; }

    @Override
    public int compareTo(HashElement<K, V> otherHashElement) {
      return ((Comparable<K>)this.key).compareTo(otherHashElement.key);
    }
  }

  int elementSize = 0;
  int tableSize;
  double maxLoadFactor;
  LinkedList<HashElement<K, V>>[] hashtable;

  public HashMap(int tableSize) {
    this.tableSize = tableSize;
    this.hashtable = (LinkedList<HashElement<K, V>>[]) new LinkedList
        [tableSize]; // Fixed array initialization
    this.maxLoadFactor = 0.75;
    this.elementSize = 0;
    for (int i = 0; i < tableSize; i++) {
      this.hashtable[i] = new LinkedList<>();
    }
  }

  // associative array for fast search and removal
  // one for key another for value

  // hash function is property of data
  // fast, low collision
  // equal return same value
  public int hashCode(String s, int tableSize) {
    int g = 31;
    int hash = 0;
    for (int i = 0; i < s.length(); i++) {
      hash = g * hash + s.charAt(i);
    }
    // if modulo result is negative -> change the first bit
    // to dissolve negative , number & 0X07FFFFFFF
    return hash % tableSize;
  }

  public int hashIndex(int hash) { return (hash & 0x7FFFFFFF) % tableSize; }
  // to avoid collision
  // odd sized or prime number table

  public boolean add(K key, V value) {
    if (getLoadFactor() > maxLoadFactor) {
      resize(tableSize * 2);
    }

    int index = hashIndex(key.hashCode()); // index to add
    if (hashtable[index] == null) {
      hashtable[index] =
          new LinkedList<>(); // Create a new LinkedList if it doesn't exist
    }
    HashElement<K, V> newHash = new HashElement<>(key, value);
    hashtable[index].add(newHash);
    elementSize++;
    return true;
  }

  public double getLoadFactor() { return (double)elementSize / tableSize; }

  public void resize(int newTableSize) {
    LinkedList<HashElement<K, V>>[] newTable =
        (LinkedList<HashElement<K, V>>[]) new LinkedList[newTableSize];
    for (int i = 0; i < newTableSize; i++) {
      newTable[i] = new LinkedList<>();
    }

    for (LinkedList<HashElement<K, V>> list : hashtable) {
      if (list != null) {
        for (HashElement<K, V> element : list) {
          int index = hashIndex(element.getKey().hashCode());
          newTable[index].add(element);
        }
      }
    }
    tableSize = newTableSize;
    hashtable = newTable;
  }

  public V getvalue(K key) {
    int index = hashIndex(key.hashCode());
    LinkedList<HashElement<K, V>> current = hashtable[index];

    if (current != null) {
      for (var element : current) {
        if (element.getKey().equals(key)) {
          return element.getValue();
        }
      }
    }
    return null;
  }
}
