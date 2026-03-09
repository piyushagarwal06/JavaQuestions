package LinkedList;


//Split a linked list into two halves.

public class splitLLHalfOptimized {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node split(Node head) {
        if (head == null || head.next == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;


        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        Node secondHalf = slow.next;
        slow.next = null;

        return secondHalf;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Create linked list
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        //head.next.next.next.next.next = new Node(6);


        System.out.print("Original List: ");
        printList(head);

        Node second = split(head);

        System.out.print("First Half:    ");
        printList(head);

        System.out.print("Second Half:   ");
        printList(second);
    }
}
