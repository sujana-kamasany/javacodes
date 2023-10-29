package implementation;

public class LinkedList<E> {
  class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
      this.data = data;
      next = null;
    }
  }

  private Node<E> head;
  private int size;

  public LinkedList() {
    head = null;
    size = 0;
  }

  public void prepend(E data) {
    Node<E> node = new Node<E>(data);
    node.next = head;
    head = node;
    size++;
  }

  public void removeFirst() {
    if (head == null)
      return;
    head = head.next;
  }

  public void add(E data) {
    Node<E> node = new Node<E>(data);
    if (head == null) {
      head = node;
      size++;
      return;
    }

    Node<E> current = head;
    while (current.next != null) {
      current = current.next;
    }
    current.next = node;
    size++;
  }
  public void removeLast() {
    if (head == null)
      return;

    // head == tail, removeFirst
    if (head.next == null) {
      removeFirst();
      return;
    }

    Node<E> current = head;
    Node<E> previous = null;

    while (current.next != null) {
      previous = current;
      current = current.next;
    }

    previous.next = null;
    size--;
  }

  public void remove(E data) {
    if (head == null) {
      return; // List is empty
    }

    if (head.data.equals(data)) {
      // If the data to remove is in the head node, remove the head
      removeFirst();
      return;
    }

    Node<E> current = head;
    Node<E> previous = null;

    while (current != null && !current.data.equals(data)) {
      previous = current;
      current = current.next;
    }

    if (current != null) {
      previous.next = current.next;
      size--;
    }
  }
}
