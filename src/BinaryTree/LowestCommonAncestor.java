package BinaryTree;
import java.util.*;

public class LowestCommonAncestor {
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
    public static void lca1(Node root, int n1, int n2){
        ArrayList<Integer> path1 = new ArrayList<>();
        ArrayList<Integer> path2 = new ArrayList<>();
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
    }
}
