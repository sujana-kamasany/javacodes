package Basics.CircularLinkedList;

public class CircularLinkedListTest {
	public static void main(String[] args) {
		CircularLinkedList<String> cll = new CircularLinkedList<>();
		cll.add("a");
		cll.add("b");
		cll.add("c");
        //a, b, c
        System.out.println(cll.toString());


		cll.insertAt(2, "f");

        //a, b, c, f
        System.out.println(cll.toString());



	}
}
