package Trees;

public class sizeOfTreeUsingRecursion {

    static class Node{
        int val;
        Node left;
        Node right;
        Node(int val){
            this.val=val;
        }
    }

    static int size(Node root){
        if(root==null) return 0;
        return size(root.left)+size(root.right) + 1;
    }

    public static void main(String[] args) {
        Node root= new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        root.left=a;
        root.right=b;
        Node c=new Node(4);
        Node d=new Node(5);
        a.left=c;
        a.right=d;
        Node e=new Node(6);
        b.right=e;
        System.out.println(root.val);
        System.out.println("Size of the tree is "+ size(root));

    }
}
