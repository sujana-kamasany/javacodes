public class CircularLinkedList {  
    // It represents the node of list.  
    public class Node{  
        int data;  
        Node next;  
        public Node(int data) {  
            this.data = data;  
        }  
    }  
  
    //Declared head and tail pointer as null  
    public Node head = null;  
    public Node tail = null;  
  
    //with this function new node will be added at the end  
    public void add(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //Checks if the list is empty.  
        if(head == null) {  
             //If list is empty, both head and tail would point to new node.  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail will point to new node.  
            tail.next = newNode;  
            //New node will become new tail.  
            tail = newNode;  
            //Since, it is circular linked list tail will point to head.  
            tail.next = head;  
        }  
    }  
  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list are : ");  
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  

    //Delete a particular node
    public Node deleteNode(int valueToBeDeleted) {
        //If list is empty
        if(head == null) return null;

        //if only one node present
        if(tail.data == valueToBeDeleted && tail.next == tail) {
            tail = null;
            head = null;
        }
        Node temp = tail;
        //if last node contains the value to be deleted
        if(tail.data == valueToBeDeleted) {
            //iterate till node before tail
            while(temp.next != tail) {
                temp = temp.next;
            }

            //point temp node to next of tail
            temp.next = tail.next;
            tail = temp.next;
        }
        //node to be deleted is inbetween
        while(temp.next != tail && temp.next.data != valueToBeDeleted) {
            temp = temp.next;
        }
        //when node to be deleted is found
        if(temp.next.data == valueToBeDeleted) {
            Node toBeDeleted = temp.next;
            temp.next = toBeDeleted.next;
        }
        //if node to be deleted is first node
        if(head.data == valueToBeDeleted) {
            tail.next = head.next;
            head = tail.next;
        }
        return tail;
    }
  
    public static void main(String[] args) {  
        CreateList cl = new CreateList();  
        //Adds data to the list  
        cl.add(9);  
        cl.add(3);  
        cl.add(8);  
        cl.add(5);  
        //Displays all the nodes present in the list  
        cl.display();  
    }  
}
