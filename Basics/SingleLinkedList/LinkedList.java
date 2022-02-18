public class LinkedList {

    Node head;

    LinkedList() {}

    void insert(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }

        Node node = new Node(data);
        Node temp = head;
        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void display() {
        if (head == null) {
            System.out.println("Empty linked list");
            return;
        }
        Node temp = head;
        while(temp.next != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }
}
