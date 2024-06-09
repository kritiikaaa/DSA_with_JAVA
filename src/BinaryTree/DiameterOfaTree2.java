package BinaryTree;

public class DiameterOfaTree2 {
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

    static class Info{
        int diam;
        int ht;

        public Info(int diam, int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }

    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }
        Info linfo = diameter(root.left);
        Info rinfo = diameter(root.right);

        int diam = Math.max(Math.max(linfo.diam, rinfo.diam), linfo.ht+rinfo.ht+1);
        int ht = Math.max(linfo.ht, rinfo.ht) +1;

        return new Info(diam, ht);
    }

    public static void main(String[] args) {
        Node root = new Node(1);                   //       1
        root.left = new Node(2);                   //     /   \
        root.right = new Node(3);                  //    2     3
        root.left.left = new Node(4);              //   / \   / \
        root.left.right = new Node(5);             //   4  5  6  7
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println("("+diameter(root).diam+","+ diameter(root).ht+")");
    }
}
