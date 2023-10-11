public class LinkedList<T> {

    private Node<T> head;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insertion at the end of the LinkedList
    public void insert(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete from the beginning of the LinkedList
    public void deleteFromStart() {
        if (head != null) {
            head = head.next;
        }
    }

    // Delete from the end of the LinkedList
    public void deleteFromEnd() {
        if (head == null || head.next == null) {
            head = null;
        } else {
            Node<T> current = head;
            while (current.next.next != null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    // Delete a node that appears immediately before a specific value
    public void deleteBeforeValue(T targetValue) {
        if (head == null || head.next == null) {
            return; // Not enough nodes to perform deletion
        }

        if (head.next.data.equals(targetValue)) {
            head = head.next; // Special case: the targetValue is the second node
        } else {
            Node<T> current = head;
            while (current.next != null && !current.next.data.equals(targetValue)) {
                current = current.next;
            }

            if (current.next != null) {
                current.next = current.next.next;
            }
        }
    }

    // Search for a specific value in the LinkedList
    public boolean search(T targetValue) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(targetValue)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display the LinkedList
    public void display() {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original LinkedList:");
        list.display();

        list.deleteFromStart();
        System.out.println("After deleting from start:");
        list.display();

        list.deleteFromEnd();
        System.out.println("After deleting from end:");
        list.display();

        int targetValue = 3;
        list.deleteBeforeValue(targetValue);
        System.out.println("After deleting before value " + targetValue + ":");
        list.display();
    }
}
