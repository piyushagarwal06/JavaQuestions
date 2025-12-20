package LinkedList;

public class MergeSortedLists {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static  void exhibit(Node list1,Node list2){
        Node temp=new Node(0);
        Node curr=temp;

        while(list1!=null && list2!=null){
            if(list1.data<=list2.data){
                curr.next=list1;
                list1=list1.next;
            }
            else{
                curr.next=list2;
                list2=list2.next;
            }
            curr=curr.next;
        }
        if(list1!=null) curr.next=list1;
        else curr.next=list2;

        printList(temp.next);

    }

    static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
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

        exhibit(list1,list2);
    }
}
