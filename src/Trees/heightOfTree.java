package Trees;

public class heightOfTree {
    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }
    static int height(Node root){
        if(root==null) return 0;
        if(root.left==null && root.right==null) return 0;  //leaf node
        return 1+ Math.max(height(root.left),height(root.right));
    }

    static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    static int sum(Node root){
        if(root==null) return 0;
        return root.val + sum(root.left)+sum(root.right) ;
    }

    static int size(Node root){//size=total number of nodes in a tree
        if(root==null) return 0;
        return size(root.left)+size(root.right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(-1);
        Node a = new Node(-2);
        Node b = new Node(-33);
        root.left = a;
        root.right = b;
        Node c = new Node(-4);
        Node d = new Node(-5);
        a.left = c;
        a.right = d;
        Node e = new Node(-6);
        Node f= new Node(-7);
        b.right = e;
        e.left=f;
        System.out.println(root.val);
        System.out.println("Size of the tree is " + size(root));
        System.out.println("Sum of the tree is " + sum(root));
        System.out.println("Maximum value  of the tree is " + max(root));
        System.out.println("Height of the tree is: "+ height(root));

    }
}
