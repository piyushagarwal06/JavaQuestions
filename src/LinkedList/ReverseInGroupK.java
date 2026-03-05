package LinkedList;

import java.util.Scanner;

//Given a singly linked list, reverse the nodes in groups of size K.
//If the list has fewer than K nodes in the last group, keep them in the same (original) order.
//Only the nodes inside each group should be reversed.

public class ReverseInGroupK {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class linkedList {
        Node head = null;
        Node tail = null;

        //insert at end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // Insert at beginning
        void insertAtBegin(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        // Get size
        int size() {
//            System.out.println("size of linked list is");
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        // Insert at specific index
        void insertAt(int idx, int val) {
            Node temp = new Node(val);
            if (idx < 0) {
                System.out.println("Index cannot be negative");
                return;
            }

            if (head == null) {
                head = tail = temp;
                return;
            }

            if (idx == 0) {
                insertAtBegin(val);
                return;
            }

            if (idx == size()) {
                insertAtEnd(val);
                return;
            }

            Node a = head;
            for (int i = 1; i <= idx - 1; i++) {
                a = a.next;
                if (a == null) {           // <-- ADD THIS
                    System.out.println("Index out of bounds");
                    return;
                }
            }
            temp.next = a.next;
            a.next = temp;

            // If inserted at end
            if (temp.next == null) {
                tail = temp;
            }
        }

        void display() {
            Node temp = head;
            System.out.println("elements of linked list are");
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        Node revG(Node head,int k){
            if (head == null) return null;//base case

            Node temp=head;
            int count=0;

            //check if we have K nodes
            while(temp!=null && count<k){
                temp=temp.next;
                count++;
            }
            if(count<k) return head;

            temp=head;
            Node prev=null;
            Node front=null;
            count=0;

            while(temp!=null && count<k){
                front=temp.next;
                temp.next=prev;
                prev=temp;
                temp=front;
                count++;
            }
            head.next=revG(front,k);//recursive cal
            return prev;
        }
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int index = 0;
        while(num!=-1){
            ll.insertAt(index, num);   // correct call
            index++;                   // move to next index
            num = sc.nextInt();
        }
        ll.display();
        ll.head=ll.revG(ll.head,3);
        ll.display();
    }
}
