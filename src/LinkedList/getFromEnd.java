package LinkedList;

public class getFromEnd {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class getNthEnd{
        Node head=null;
        Node tail=null;

        static int potray(Node head,int n){
            Node slow=head;
            Node fast=head;
            for (int i = 0; i < n; i++) {
                if (fast == null) {
                    throw new IndexOutOfBoundsException("n is too large");
                }
                fast = fast.next;
            }

            while (fast.next != null) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow.data;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        System.out.println(getNthEnd.potray(head,2));
    }
}
