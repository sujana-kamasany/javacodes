package Basics.CircularLinkedList;

public class ListNode<T> {
	private T data;
	private ListNode next;

	public ListNode(T data) {
        this.data = data;
	}

    public T getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
		this.next = next;
	}
}
