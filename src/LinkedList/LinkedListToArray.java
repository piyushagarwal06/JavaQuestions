package LinkedList;

public class LinkedListToArray {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static int [] convert(Node head,int arr[]){
        Node temp=head;
        for(int i=0; temp!=null;i++){
            arr[i]=temp.data;
            temp=temp.next;
        }
        return arr;
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List:");
        printList(head);

        int arr[]=new int[5];
        int grr[]=convert(head,arr);
        for(int i:grr){
            System.out.println(i);
        }
    }
}
