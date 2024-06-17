package BinarySearchTree;

public class ArrayToBalancedBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){this.data = data;
        }
    }

    public static Node balancedBST(int[] arr, int start, int end){
        if(start>end){
            return null;
        }
            int mid = (start+end)/2;
            Node root = new Node(arr[mid]);
            root.left = balancedBST(arr,start,mid-1);
            root.right = balancedBST(arr, mid+1, end);
        return root;
    }

    public static Node preOrder(Node root){
        if(root==null){
            return null;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
        return root;
    }

    public static void main(String[] args) {                       //       8
        int[] arr = {3,5,6,8,10,11,12};                           //      /   \
        Node root = balancedBST(arr,0,arr.length-1);    //      5    11
        preOrder(root);                                          //     / \   / \
    }                                                           //      3 6  10 12
}