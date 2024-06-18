package BinarySearchTree;
import java.util.*;

public class Merge2BST {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root==null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }

    public static Node createBST(ArrayList<Integer> inorder, int st, int end){
        if(st > end){
            return null;
        }
        int mid = (st + end) / 2;
        Node root = new Node(inorder.get(mid));
        root.left = createBST(inorder, st, mid - 1);
        root.right = createBST(inorder, mid + 1, end);
        return root;
    }


    public static Node mergeBST(Node root1, Node root2){
      // get inorder sequences for both given BSTs
      ArrayList<Integer> inorder1 = new ArrayList<>();
      getInorder(root1,inorder1);

        ArrayList<Integer> inorder2 = new ArrayList<>();
        getInorder(root2,inorder2);

        //Merge them
        ArrayList<Integer> finalInorder = new ArrayList<>(); //sorted arraylist
        int i=0, j=0;
        while(i<inorder1.size() && j<inorder2.size()){
            if(inorder1.get(i)<=inorder2.get(j)){
                finalInorder.add(inorder1.get(i));
                i++;
            } else{
                finalInorder.add(inorder2.get(j));
                j++;
            }
        }

        //for remaining elements in either arraylist (if any)
        while(i<inorder1.size()){
            finalInorder.add(inorder1.get(i));
            i++;
        }
        while(j<inorder2.size()){
            finalInorder.add(inorder2.get(j));
            j++;
        }

        //sorted arrayList -> Balanced BST
        return createBST(finalInorder,0,finalInorder.size()-1);
    }

    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        /*             2
                     /   \
                    1     4
                      BST1
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*             9
                     /   \
                    3    12
                      BST2
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);
        /*                3
                      /       \
                     1         9
                      \      /   \
                       2    4    12
                        Final BST
         */
        Node root = mergeBST(root1, root2);
        preOrder(root);
    }
}
