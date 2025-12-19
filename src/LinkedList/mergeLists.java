package LinkedList;

public class mergeLists {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void merge(Node list1, Node list2) {
        if (list1 == null) {
            return;
        }
        if (list2 == null) {
            return;
        }

        Node current = list1;

        while (current.next != null) {
            current = current.next;
        }

        current.next = list2;

        printList(list1);
    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node list1 = new Node(10);
        list1.next = new Node(20);
        list1.next.next = new Node(30);

        Node list2 = new Node(15);
        list2.next = new Node(25);
        list2.next.next = new Node(35);

        System.out.print("List 1: ");
        printList(list1);

        System.out.print("List 2: ");
        printList(list2);

        merge(list1,list2);
    }
}
