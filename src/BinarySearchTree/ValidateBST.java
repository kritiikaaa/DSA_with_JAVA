package BinarySearchTree;

import java.util.ArrayList;

public class ValidateBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){this.data = data;
        }
    }
    public static Node insert(Node root, int val){
        if(root==null){
            root= new Node(val);
            return root;
        }
        if(val<root.data){
            root.left = insert(root.left, val);
        }
        if(val>=root.data){
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static boolean isValid(Node root, Node min, Node max){
        if(root==null){
            return true;
        } else if(min!=null && root.data<=min.data){
            return false;
        } else if(max!=null && root.data>=max.data){
            return false;
        }
        return isValid(root.left, min, root) && isValid(root.right,root, max);
    }

    public static void main(String[] args) {
        ArrayList<Integer> path=new ArrayList<>();
        int[] val = {1,1,1};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = insert(root,val[i]);
        }

        //to check = inorder traversal should be in ascending order
        inorder(root);
        System.out.println();
        if(isValid(root,null,null)){
            System.out.println("Valid BST");
        } else{
            System.out.println("Invalid BST");
        }
    }
}
