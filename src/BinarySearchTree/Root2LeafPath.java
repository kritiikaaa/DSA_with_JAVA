package BinarySearchTree;
import java.util.*;

public class Root2LeafPath {

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
        if(val>root.data){
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

    public static void printPath(ArrayList<Integer> path){
        for(int i=0; i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.print("null");
    }

    public static void root2leaf(Node root, ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null  && root.right==null){
            printPath(path);
            System.out.println();
        }
        root2leaf(root.left, path);
        root2leaf(root.right, path);
        path.remove(path.size()-1);
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
        root2leaf(root,path);
    }
}
