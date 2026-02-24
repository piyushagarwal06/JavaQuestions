package LinkedList;

import java.util.Scanner;

public class removeDuplicatesFromSortedLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node apply(Node head){
        Node front=head.next;
        Node curr=head;

        while(front!=null){
            if(front.data==curr.data){
                curr.next=front.next;
            }
            else{
                curr=front;
            }
            front=front.next;

        }
        return head;
    }

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        head.next.next.next.next = new Node(3);

        System.out.print("Before removing duplicates: ");
        printList(head);

        head = apply(head);

        System.out.print("After removing duplicates: ");
        printList(head);
    }

}
