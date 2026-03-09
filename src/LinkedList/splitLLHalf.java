package LinkedList;

import java.util.Scanner;

public class splitLLHalf {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node split(Node head,int size){
        Node temp=head;
        int c=0;
        while(c!=size/2-1){
            temp=temp.next;
            c++;
        }
        Node sp=temp.next;
        temp.next=null;
        return sp;
    }

    static int size(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
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
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printList(head);

        int count=size(head);

//        split(head,count);

        Node sp = split(head, count);

        printList(head);
        printList(sp);
    }
}
