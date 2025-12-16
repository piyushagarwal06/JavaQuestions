package LinkedList;

import java.util.Scanner;

public class displayMidNode {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class midNode {
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
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
        void middle(){
            int count=size();
            Node temp=head;
            int mid = (count - 1) / 2;  // 0-based index
            for(int i=0;i<=mid-1;i++){
                temp=temp.next;
            }
            if(count%2==0){
                System.out.println("Middle nodes are");
                System.out.println(temp.data);
                System.out.println(temp.next.data);
            }else {
                System.out.println("Middle node is");
                System.out.println(temp.data);
            }
        }
    }

    public static void main(String[] args) {
        midNode ll=new midNode();
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int index = 0;
        while(num!=-1){
            ll.insertAt(index, num);   // correct call
            index++;                   // move to next index
            num = sc.nextInt();
        }
        ll.display();
        ll.middle();
    }

}
