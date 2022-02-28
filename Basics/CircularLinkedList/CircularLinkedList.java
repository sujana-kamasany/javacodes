package Basics.CircularLinkedList;

public class CircularLinkedList<T> {
	private ListNode<T> firstNode;

    //add at end
	public void add(T data) {
		ListNode node = new ListNode(data);
		if (firstNode == null) {
			this.firstNode = node;
			return;
		}
        node.setNext(firstNode); //this is why circular linked list
        insertAt(size() - 1, data);
	}

    public void insertAt(int at, T insertData) {
        if (at < 0) {
            return;
        }
        ListNode<T> prevNode = getNode(at);
        ListNode<T> newNode = new ListNode<>(insertData);

        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
    }

    private ListNode<T> getNode(int at) {
        int index = 0;
        ListNode<T> node = firstNode;
        while (index != at) {
            index++;
            node = node.getNext();
        }
        return node;
    }

    //get Data
    public T get(int at) {
        if (at < 0) {
            return null;
        }
        int index = 0;
        ListNode<T> node = firstNode;
        while (index != at) {
            index++;
            node = node.getNext();
        }
        return node.getData();
    }

    //get Size
    public int size() {
        if (firstNode == null) {
            return 0;
        }

        int size = 0;
        ListNode<T> prev = this.firstNode;
        while (prev != null) {
            size++;
            prev = prev.getNext();
        }

        return size;
    }


    //for print out
    //ex) [a, b, c, d]
    @Override
    public String toString() {
        String str = "[";
        ListNode<T> prev = this.firstNode;
        while (prev != null) {
            if (prev.getNext() == null) {
                str += prev.getData() + "]";
            } else {
                str += prev.getData() + ", ";
            }
            prev = prev.getNext();
        }
        return str;
    }
}
