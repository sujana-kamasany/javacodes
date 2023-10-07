package CircularLinkedList;

public class CircularLinkedList<T> {
	private ListNode<T> firstNode;
    private ListNode<T> lastNode;
    private int size = 0;

    //add at end
	public void add(T data) {
		ListNode node = new ListNode(data);
        size++;
		if (firstNode == null) {
			this.firstNode = node;
			return;
        } else if (this.lastNode == null) {
            node.setNext(this.firstNode);
            this.firstNode.setNext(node);

            this.lastNode = node;
            return;
        }

        this.lastNode.setNext(node);
        node.setNext(this.firstNode); //this is why circular linked list
        this.lastNode = node;
    }

    public void insertAt(int at, T insertData) {
        if (at < 0) {
            return;
        } else if (at == 0) {
            size++;
            ListNode<T> node = new ListNode<>(insertData);
            node.setNext(this.firstNode);
            this.lastNode.setNext(node);
            return;
        }
        ListNode<T> prevNode = getNode(at);
        ListNode<T> newNode = new ListNode<>(insertData);

        newNode.setNext(prevNode.getNext());
        prevNode.setNext(newNode);
        size++;
    }

    private ListNode<T> getNode(int at) {
        ListNode<T> node = firstNode;
        for (int i = 0; i < at - 1; i++) {
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
        return this.size;
    }

    public void deleteAt(int at) {
        if (at < 0) {
            return;
        } else if (at == 0) {
            ListNode nextNode = firstNode.getNext();
            this.lastNode.setNext(nextNode);
            this.firstNode = nextNode;
            size--;
            return;
        }
        ListNode<T> deleteNode = getNode(at);
        ListNode<T> prev = getNode(at - 1);
        prev.setNext(deleteNode.getNext());
        size--;
    }


    //for print out
    //ex) [a, b, c, d]
    @Override
    public String toString() {
        String str = "[";
        ListNode<T> prev = this.firstNode;

        for (int i = 0; i < this.size; i++) {
            if (i == this.size - 1) {
                str += prev.getData() + "]";
            } else {
                str += prev.getData() + ", ";
            }
            prev = prev.getNext();
        }

        return str;
    }
}
