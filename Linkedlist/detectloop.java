class LinkedList {

  // create an object of Node class
  // represent the head of the linked list
  Node head;

  // static inner class
  static class Node {
    int value;

    // connect each node to next node
    Node next;

    Node(int d) {
      value = d;
      next = null;
    }
  }

  // check if loop is present
  public boolean checkLoop() {

    // create two references at start of LinkedList
    Node first = head;
    Node second = head;

    while(first != null && first.next !=null) {

      // move first reference by 2 nodes
      first = first.next.next;

      // move second reference by 1 node
      second = second.next;

      // if two references meet
      // then there is a loop
      if(first == second) {
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {

    // create an object of LinkedList
    LinkedList linkedList = new LinkedList();

    // assign values to each linked list node
    linkedList.head = new Node(1);
    Node second = new Node(2);
    Node third = new Node(3);
    Node fourth = new Node(4);

    // connect each node of linked list to next node
    linkedList.head.next = second;
    second.next = third;
    third.next = fourth;

    // make loop in LinkedList
    fourth.next = second;

    // printing node-value
    System.out.print("LinkedList: ");
    int i = 1;
    while (i <= 4) {
      System.out.print(linkedList.head.value + " ");
      linkedList.head = linkedList.head.next;
      i++;
    }

    // call method to check loop
    boolean loop = linkedList.checkLoop();
    if(loop) {
      System.out.println("\nThere is a loop in LinkedList.");
    }
    else {
      System.out.println("\nThere is no loop in LinkedList.");
    }
  }
}
