package Trees;

public class sizeOfTreeUsingVariable {
    static int size=0;
    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val=val;
        }
    }

    static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        size++;
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        Node root=new Node(2);
        Node a=new Node(4);
        Node b=new Node(10);
        root.left=a;
        root.right=b;
        Node c=new Node(6);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(11);
        b.right=e;
        System.out.println(root.val);
        preorder(root);
        System.out.println();
        System.out.println("Size of the tree is "+size);
    }
}
