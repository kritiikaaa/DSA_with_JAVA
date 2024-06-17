package BinarySearchTree;

import java.util.ArrayList;

public class MirrorBST {

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

    public static Node mirror(Node root){
        if(root==null){
            return null;
        }
        Node leftS = mirror(root.left);
        Node rightS = mirror(root.right);

        root.right = leftS;
        root.left = rightS;

        return root;
    }

    public static void main(String[] args) {
        ArrayList<Integer> path=new ArrayList<>();
        int[] val = {8,5,3,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = insert(root,val[i]);
        }

        //to check = inorder traversal should be in ascending order
        inorder(root);
        System.out.println();
        mirror(root);
        inorder(root);
    }
}
