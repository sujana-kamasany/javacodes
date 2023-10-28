package CircularLinkedList;

public class CircularLinkedListTest {
	public static void main(String[] args) {
		CircularLinkedList<String> cll = new CircularLinkedList<>();

        //a, b, c
		cll.add("a");
		cll.add("b");
		cll.add("c");
        System.out.println(cll.size()); //3

		cll.insertAt(1, "d");
        System.out.println(cll.get(1)); //d

        //a, d, b, c
        System.out.println(cll.toString());

        cll.deleteAt(2);
        //a, d, c
        System.out.println(cll.toString());

	}
}
