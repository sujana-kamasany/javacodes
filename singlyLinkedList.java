import java.util.*;

class Node{
    int data;
    Node next;
    
    Node()
    {
        next=null;
    }
    Node(int data)
    {
        this.data=data;
        next=null;
    }
    
}
class LinkedList
{int count=1;
    int data;
    Node head;
    Node ptr;
    Node temp;
    LinkedList()
    {
        head=null;
    }
    void insert(int data)
    {
         temp=new Node(data);
    if(head==null)
    {
        head=temp;
    }
    else
    {
        ptr=head;
        while(ptr.next!=null)
        {
            ptr = ptr.next;
        }
        ptr.next = temp;
        }
    }
    
    void display()
    {
        Node ptr=head;
        while(ptr!=null)
        {
        System.out.println("data is= "+ptr.data);
        ptr=ptr.next;
        }

    }
    

}



public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int y,d;
	    //creating object of LinkedList class
	    LinkedList l =new LinkedList();
	    //user input for linked list data
	    do{
	        System.out.println("enter data =");
	        d=sc.nextInt();
	        l.insert(d);
	        System.out.println("if you want to add more enter 1 else enter 0");
	        y=sc.nextInt();
	       
	    }while(y==1);
	    
	    //display method for the stored data
	    l.display();
	    
	}
}


