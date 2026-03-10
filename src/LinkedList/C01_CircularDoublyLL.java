package LinkedList;

public class C01_CircularDoublyLL {
    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    // Display list starting from head (once around the circle)
    public static void display(Node head) {
        if (head == null) return;

        Node temp = head;
        do {
            System.out.print(temp.val + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Display list in reverse starting from tail (once around)
    public static void displayRev(Node head) {
        if (head == null) return;

        Node tail = head.prev;
        Node temp = tail;
        do {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        } while (temp != tail);
        System.out.println();
    }

    // Insert at head
    public static Node insertAtHead(Node head, int val) {
        Node t = new Node(val);
        if (head == null) {
            t.next = t.prev = t;
            return t; // new head
        }

        Node tail = head.prev;

        t.next = head;
        t.prev = tail;
        tail.next = t;
        head.prev = t;

        return t; // new head
    }

    // Insert at tail
    public static Node insertAtTail(Node head, int val) {
        if (head == null) {
            return insertAtHead(head, val);
        }

        Node tail = head.prev;
        Node t = new Node(val);

        t.next = head;
        t.prev = tail;
        tail.next = t;
        head.prev = t;

        return head; // head remains same
    }

    // Insert at index (0-based)
    public static Node insertAtIndex(Node head, int idx, int val) {
        if (idx == 0 || head == null) {
            return insertAtHead(head, val);
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
            if (temp == head) break; // index out of range
        }

        Node t = new Node(val);
        Node nextNode = temp.next;

        temp.next = t;
        t.prev = temp;

        t.next = nextNode;
        nextNode.prev = t;

        return head;
    }

    // Delete head
    public static Node deleteAtHead(Node head) {
        if (head == null) return null;
        if (head.next == head) return null; // only one node

        Node tail = head.prev;
        head = head.next;
        head.prev = tail;
        tail.next = head;

        return head;
    }

    // Delete tail
    public static Node deleteAtTail(Node head) {
        if (head == null) return null;
        if (head.next == head) return null;

        Node tail = head.prev;
        Node newTail = tail.prev;

        newTail.next = head;
        head.prev = newTail;

        return head;
    }

    // Delete at index (0-based)
    public static Node deleteAtIndex(Node head, int idx) {
        if (head == null) return null;
        if (idx == 0) return deleteAtHead(head);

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            temp = temp.next;
            if (temp == head) return head; // index out of range
        }

        Node delNode = temp.next;
        temp.next = delNode.next;
        delNode.next.prev = temp;

        return head;
    }

    // Main method to test circular doubly linked list
    public static void main(String[] args) {
        Node head = null;

        // Insert nodes at tail
        head = insertAtTail(head, 4);
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 2);
        head = insertAtTail(head, 99);
        head = insertAtTail(head, 13);

        System.out.println("Circular DLL forward:");
        display(head);

        System.out.println("Circular DLL reverse:");
        displayRev(head);

        // Insert at head
        head = insertAtHead(head, 35);
        System.out.println("After inserting 35 at head:");
        display(head);

        // Insert at index
        head = insertAtIndex(head, 3, 740);
        System.out.println("After inserting 740 at index 3:");
        display(head);

        // Delete head
        head = deleteAtHead(head);
        System.out.println("After deleting head:");
        display(head);

        // Delete tail
        head = deleteAtTail(head);
        System.out.println("After deleting tail:");
        display(head);

        // Delete at index
        head = deleteAtIndex(head, 2);
        System.out.println("After deleting node at index 2:");
        display(head);
    }
}
