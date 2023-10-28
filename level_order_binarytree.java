import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    Node root;

    BinarySearchTree() {
        root = null;
    }

    void create(int c) {
        if (root == null) {
            root = new Node(c);
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();
            if (temp.left == null) {
                temp.left = new Node(c);
                return;
            } else {
                queue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new Node(c);
                return;
            } else {
                queue.add(temp.right);
            }
        }
    }

    void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.println("data: " + root.data);
        inorder(root.right);
    }
}

public class Tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BinarySearchTree obj = new BinarySearchTree();

        System.out.println("Enter elements separated by commas: ");
        String s = sc.next();
        String[] res = s.split("[,]", 0);

        for (String myStr : res) {
            int y = Integer.parseInt(myStr);
            obj.create(y);
        }

        obj.inorder(obj.root);
    }
}
