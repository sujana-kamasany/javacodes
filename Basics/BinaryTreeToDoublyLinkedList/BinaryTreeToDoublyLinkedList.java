public class BinaryTreeToDoublyLinkedList {

    // Method to convert a given root of a binary tree to doubly linked list
    public static DoublyLinkedList binaryTreeToDoublyLinkedList(Node root) {
        DoublyLinkedList list = new DoublyLinkedList();
        binaryToDoublyHelper(root, list);
        return list;
    }

    // Recursive method to add the values from the binary tree to the doubly linked list
    // using the inorder traversal algorithm
    public static void binaryToDoublyHelper(Node root, DoublyLinkedList list) {
        if (root != null) {
            binaryToDoublyHelper(root.left, list);
            list.add(root.value);
            binaryToDoublyHelper(root.right, list);
        }
    }

    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    // Testing the methods above.
    // creating the example:
    //        1
    //    2       3
    // 4     5 6     7

    // output should be:
    // 4 <-> 2 <-> 5 <-> 1 <-> 6 <-> 3 <-> 7 <-> null
    public static void main(String[] args) {
        Node root = createExample();
        DoublyLinkedList result = binaryTreeToDoublyLinkedList(root);
        result.printList();
    }

    static class BinaryTree {
        Node root;

        BinaryTree() {
            root = null;
        }
    }

    // Method to create the example tree
    public static Node createExample() {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        return tree.root;
    }
}
