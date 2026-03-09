package LinkedList;

public class swapTwoNodes {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static void swap(Node head,int x,int y){
        Node temp=head;
        Node prevX=null;
        Node prevY=null;

        if(x==y) return ;

        Node currX=head;
        while(currX!=null && currX.data!=x){
            prevX=currX;
            currX=currX.next;
        }

        Node currY=head;
        while (currY!=null && currY.data!=y){
            prevY=currY;
            currY=currY.next;
        }

        // If either x or y is not present
        if (currX == null || currY == null)
            return;


        // If x is not head of linked
        if(prevX!=null){
            prevX.next=currY;
        }
        else head=currY;

        if(prevY!=null){
            prevY.next=currX;
        }
        else head=currX;

        //Swapping next pointers
        temp=currX.next;
        currX.next=currY.next;
        currY.next=temp;

    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        swapTwoNodes  list = new swapTwoNodes();

        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);

        System.out.println("Before swapping:");
        printList(head);

        swap(head ,15, 25);

        System.out.println("After swapping:");
        printList(head);
    }

}
