package LinkedList;

public class swapTwoAdjacentNodes {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node swapAdjacent(Node head) {
        Node dummy = new Node(0);
        dummy.next=head;
        Node prev = dummy;

        while (prev.next != null && prev.next.next != null) {
            Node first = prev.next;
            Node second = first.next;

            prev.next = second;
            first.next = second.next;
            second.next = first;

            prev=first;
        }
        return dummy.next;
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
        swapTwoAdjacentNodes  list = new swapTwoAdjacentNodes();

        Node head = new Node(10);
        head.next = new Node(15);
        head.next.next = new Node(20);
        head.next.next.next = new Node(25);
        head.next.next.next.next = new Node(26);

        System.out.println("Before swapping:");
        printList(head);

        head=swapAdjacent(head);

        System.out.println("After swapping:");
        printList(head);
    }

}

