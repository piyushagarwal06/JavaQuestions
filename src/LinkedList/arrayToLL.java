package LinkedList;

public class arrayToLL {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node conversion(int arr[]){
        Node head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            temp.next=new Node(arr[i]);
            temp=temp.next;
        }
        return head;
    }
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        Node head=conversion(arr);
        printList(head);
    }
}
