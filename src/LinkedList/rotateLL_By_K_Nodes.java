package LinkedList;

public class rotateLL_By_K_Nodes {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    static Node rotation(Node head,int k,int count){
        k%=count;
        Node current=head;
        while(current.next!=null){
            current=current.next;
        }

        // Step 3: Make list circular
        current.next=head;

        int newTail= count-k;

        Node newNodeTail=head;
        for(int i=1;i<newTail;i++){
            newNodeTail=newNodeTail.next;
        }
        Node newHead = newNodeTail.next;

        // Step 6: Break the circle
        newNodeTail.next = null;
        return newHead;
    }

    static int size(Node head){
        int count=0;
        Node temp=head;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    static void print(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        int k=3;
       Node head = new Node(10);
       head.next = new Node(15);
       head.next.next = new Node(20);
       head.next.next.next = new Node(25);
       head.next.next.next.next = new Node(26);
       int count=size(head);
       Node r=rotation(head,k,count);
       print(r);

    }

}
