package LinkedList;

public class identifyIdentical {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Boolean identical(Node list1, Node list2) {
        Node temp = list1;
        while (list1 != null && list2 != null) {
            if (list1.data != list2.data) {
                return false;
            } else {
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        //return true;This means it will return true even if the lengths are different.

        return list1 == null && list2 == null;// both must be null for lists to be identical
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
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

        Boolean flag = identical(list1, list2);
        System.out.println(flag);
    }
}
