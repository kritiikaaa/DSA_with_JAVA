package BinaryTree;

public class SubtreeofAnotherTree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean isIdentical(Node node, Node subRoot) {
        if (node == null && subRoot == null) {
            return true;
        } else if (node == null || subRoot == null || node.data != subRoot.data) {
            return false;
        }

        return isIdentical(node.left, subRoot.left) && isIdentical(node.right, subRoot.right);
    }

    public static boolean isSubtree(Node root, Node subRoot) {
        if (root == null) {
            return false;
        }

        if (root.data == subRoot.data && isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        // Tree
        Node root = new Node(1);                   //       1
        root.left = new Node(2);                   //     /   \
        root.right = new Node(3);                  //    2     3
        root.left.left = new Node(4);              //   / \   / \
        root.left.right = new Node(5);             //   4  5  6  7
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Sub-tree
        Node subRoot = new Node(2);                //       2
        subRoot.left = new Node(4);                //     /   \
        subRoot.right = new Node(5);               //    4     5

        System.out.println(isSubtree(root, subRoot));
    }
}
