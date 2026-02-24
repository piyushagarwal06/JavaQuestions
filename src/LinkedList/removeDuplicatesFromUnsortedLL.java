package LinkedList;

import java.util.HashSet;

public class removeDuplicatesFromUnsortedLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node apply(Node head){
        if (head == null) return null;

        HashSet<Integer>hs=new HashSet<>();
        Node temp=head;

        hs.add(temp.data);

        while(temp.next!=null){
            if(hs.contains(temp.next.data)){
                temp.next=temp.next.next;
            }
            else{
                hs.add(temp.next.data);
                temp=temp.next;
            }
        }
        return  head;

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
        head.next = new Node(3);
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
