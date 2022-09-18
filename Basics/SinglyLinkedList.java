
package Basics;
class LinkedList{
    protected Node head;
    protected Node tail;

    protected int size;
    public LinkedList(){
        this.size = 0;
    }

    public void insertAtFirst(int value){
        Node node = new Node(value);
        if(node.next == null){
            tail = head;
        }
        node.next = head;
        head = node;
        size++;
        
    }

    public void insertAtLast(int value){
        Node node = new Node(value);
        Node temp = head;
        if(temp == null){
            insertAtFirst(value);
            return;
        }
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.next = null;
        size++;
    }

    public void insertAtIndex(int index, int value){
        Node temp = head;
        for(int i=0; i<index-1; i++){
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);

        temp.next = node;
        size++;
    }

    public void deleteIndex(int index){
        Node temp = head;
        for(int i = 0; i<index-1; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        size--;
    }


    public int deleteFirst(){
        Node temp = head;
        head = temp.next;
        size--;
        return temp.value;
        
    }

    public int deleteLast(){
        Node temp = head;
        for(int i = 0; i<(size-1); i++){
            temp = temp.next;
        }
        tail = temp;
        tail.next = null;
        size--;
        return temp.value;

    }

    public void display(){
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print(temp.value + " -> ");
        System.out.print("END");
    }

    public class Node{
        protected int value;
        protected Node next;
        public Node(int value){
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}


public class SinglyLinkedList{
    public static void main(String[] args){
        LinkedList list = new LinkedList();

        list.insertAtFirst(3);
        list.insertAtFirst(6);
        list.insertAtLast(1);
        list.insertAtLast(2);
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.insertAtIndex(2, 5);
        list.deleteIndex(2);

        list.display();

    }
}

