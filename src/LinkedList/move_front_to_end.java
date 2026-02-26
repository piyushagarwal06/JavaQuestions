package LinkedList;

public class move_front_to_end {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static Node move (Node head){
        Node last =head;
        Node sec=head.next;
        while(last.next!=null){
            last = last.next;
        }
        last.next=head; // Attach head at end
        head.next=null;// Break old link
        head=sec;      // Move head forward
        return head;
    }
    static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Before:");
        print(head);

        head = move(head);

        System.out.println("After:");
        print(head);
    }
}
