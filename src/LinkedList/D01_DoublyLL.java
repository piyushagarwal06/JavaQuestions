package LinkedList;

public class D01_DoublyLL {

    public static class Node {
        int val;
        Node next;
        Node prev;

        Node(int val) {
            this.val = val;
        }
    }

    // Display list from head to tail
    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display list from tail to head
    public static void displayRev(Node tail) {
        Node temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    // Display list starting from a random node: backward to head then forward to tail
    public static void displayRandom(Node random) {
        Node temp = random;
        System.out.println("Printing list backwards from random node:");

        // Go backward to head
        while (temp.prev != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.print(temp.val + " "); // print head
        System.out.println();

        System.out.println("Now printing forward from head:");

        // Go forward to tail
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at the beginning of the list
    public static Node insertAtHead(Node head, int val) {
        Node t = new Node(val);
        if (head != null) {
            t.next = head;
            head.prev = t;
        }
        return t; // new head
    }

    // Insert at the end of the list
    public static Node insertAtTail(Node head, int val) {
        Node t = new Node(val);

        if (head == null) {
            return t; // new node becomes head
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = t;
        t.prev = temp;

        return head; // head doesn't change
    }

    // Insert at a specific index (0-based)
    public static Node insertAtIndex(Node head, int idx, int val) {
        if (idx == 0) {
            return insertAtHead(head, val);
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            if (temp.next == null) {
                break; // index out of range, insert at tail
            }
            temp = temp.next;
        }

        Node t = new Node(val);
        Node nextNode = temp.next;

        temp.next = t;
        t.prev = temp;

        if (nextNode != null) {
            t.next = nextNode;
            nextNode.prev = t;
        }

        return head;
    }

    // Delete head node
    public static Node deleteAtHead(Node head) {
        if (head == null) return null;
        head = head.next;
        if (head != null) {
            head.prev = null;
        }
        return head;
    }

    // Delete tail node
    public static Node deleteAtTail(Node head) {
        if (head == null) return null;

        if (head.next == null) {
            return null; // only one node
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null; // remove last node
        return head;
    }

    // Delete at a specific index (0-based)
    public static Node deleteAtIndex(Node head, int idx) {
        if (head == null) return null;

        if (idx == 0) {
            return deleteAtHead(head);
        }

        Node temp = head;
        for (int i = 1; i < idx; i++) {
            if (temp.next == null) return head; // index out of range
            temp = temp.next;
        }

        Node delNode = temp.next;
        if (delNode != null) {
            temp.next = delNode.next;
            if (delNode.next != null) {
                delNode.next.prev = temp;
            }
        }

        return head;
    }

    // Utility method to find the tail (last node)
    public static Node getTail(Node head) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            temp = temp.next;
        }
        return temp;
    }

    // Main method to test all operations
    public static void main(String[] args) {
        Node head = null;

        // Insert nodes at tail
        head = insertAtTail(head, 4);
        head = insertAtTail(head, 10);
        head = insertAtTail(head, 2);
        head = insertAtTail(head, 99);
        head = insertAtTail(head, 13);

        System.out.println("Original list:");
        display(head);

        System.out.println("Reverse display:");
        displayRev(getTail(head));

        System.out.println("Display from random node (node with value 2):");
        displayRandom(head.next.next); // node with value 2

        // Insert at head
        head = insertAtHead(head, 35);
        System.out.println("After inserting 35 at head:");
        display(head);

        // Insert at tail
        head = insertAtTail(head, 3939);
        System.out.println("After inserting 3939 at tail:");
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
