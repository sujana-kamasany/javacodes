public class AVL {
    TreeNode root;

    public class TreeNode { // Copied from leetcode
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode next;

        TreeNode() {

        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // Display
    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(TreeNode node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            // add indentation
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            // print the value
            System.out.println("|------->" + node.val);

        } else {
            // I'm at root node
            System.out.println(node.val);
        }
        prettyDisplay(node.left, level + 1);
    }

    // 701. Insert into a Binary Search Tree
    // TreeNode class doesn't contain height field
    // Calculate height on the fly instead of storing

    public TreeNode insertIntoBST(TreeNode root, int val) {
        root = insert(root, val);
        return root;
    }

    private TreeNode insert(TreeNode node, int val) {

        if(node == null) {
            return new TreeNode(val);
        }

        if(val < node.val) {
            node.left = insert(node.left, val);
        } else if (val > node.val) {
            node.right = insert(node.right, val);
        } else {
            return node;
        }

        return rotate(node);
    }

    private TreeNode rotate(TreeNode node) {

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        if(leftHeight - rightHeight > 1) {

            if(height(node.left.left) > height(node.left.right)) {
                return rightRotate(node);
            }

            node.left = leftRotate(node.left);
            return rightRotate(node);

        } else if(leftHeight - rightHeight < -1) {

            if(height(node.right.right) > height(node.right.left)) {
                return leftRotate(node);
            }

            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    private TreeNode rightRotate(TreeNode p) {
        TreeNode c = p.left;
        TreeNode t = c.right;

        c.right = p;
        p.left = t;

        return c;
    }


    private TreeNode leftRotate(TreeNode c) {
        TreeNode p = c.right;
        TreeNode t = p.left;

        p.left = c;
        c.right = t;

        return p;
    }

    private int height(TreeNode node) {
        if(node == null) {
            return 0;
        }
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
