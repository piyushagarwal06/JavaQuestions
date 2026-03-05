package LinkedList;

import java.util.Scanner;

public class reverseFirstK {
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

        void revK(int k){
            Node temp=head;
            Node prev=null;
            Node front=temp.next;
            Node preserve=head;
            int count=k;
            while(count>0 && preserve != null) {
                //preserve=head.next;
                preserve=preserve.next;
                count--;
            }
            count=k;
            while(count>0 && temp!=null){
                front=temp.next;
                temp.next=prev;
                prev=temp;
                temp=front;
                count--;
            }
            head.next=preserve;
            head=prev;
        }
    }

    public static void main(String[] args) {
        linkedList ll=new linkedList();
        Scanner sc= new Scanner(System.in);
        int k=sc.nextInt();
        int num=sc.nextInt();
        int index = 0;
        while(num!=-1){
            ll.insertAt(index, num);
            index++;
            num = sc.nextInt();
        }
        ll.display();
        ll.revK(k);
        ll.display();
    }
}
