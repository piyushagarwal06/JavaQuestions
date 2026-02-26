package LinkedList;

import java.util.HashSet;

public class intersectionOfTwoLL_03 {
    static class Node {
        int data;
        Node next;
        Node(int data) { this.data = data; }
    }

    static Node getIntersection(Node headA, Node headB) {
        HashSet<Node> set = new HashSet<>();
        Node temp = headA;
        while(temp != null) {
            set.add(temp);
            temp = temp.next;
        }

        temp = headB;
        while(temp != null) {
            if(set.contains(temp)) return temp;
            temp = temp.next;
        }

        return null;
    }

    static void printList(Node head) {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = new Node(30);
        headA.next.next.next = new Node(40);
        headA.next.next.next.next = new Node(50);

        Node headB = new Node(15);
        headB.next = headA.next.next.next; // intersect at 40

        System.out.println("List A:");
        printList(headA);
        System.out.println("List B:");
        printList(headB);

        Node intersection = getIntersection(headA, headB);
        System.out.println("Intersection Node: " + (intersection != null ? intersection.data : "None"));
    }
}
