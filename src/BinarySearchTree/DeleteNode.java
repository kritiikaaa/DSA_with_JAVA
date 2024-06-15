package BinarySearchTree;

public class DeleteNode {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
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

    public static Node delete(Node root, int val){
        if(root.data>val){
            root.left = delete(root.left, val);
        }
        else if(root.data<val){
            root.right = delete(root.right, val);
        }
        else{ // root.data == val

            //Case-1: Leaf node
            if(root.left==null && root.right==null){
                return null;
            }

            //Case-2: Node with single child node
            if(root.left==null){
                return root.right;
            } else if(root.right==null){
                return root.left;
            }

            //Case-3: Node with two children node
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right, IS.data);
        }
        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while(root.left!=null){
            root=root.left;
        }
        return root;
    }

    public static void main(String[] args) {
        int[] val = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0;i<val.length;i++){
            root = insert(root,val[i]);
        }

        inorder(root);
        System.out.println();

        delete(root,5);
        inorder(root);
    }
}
