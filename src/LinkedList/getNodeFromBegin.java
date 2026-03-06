package LinkedList;

public class getNodeFromBegin {
    static  class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class depictBegin {
        Node head = null;
        Node tail = null;

        static int begin(Node head,int n) {
            Node current = head;
            int count = 0;
            while (current != null) {
                if (count == n) {
                    return current.data;
                }
                current = current.next;
                count++;
            }
            throw new IndexOutOfBoundsException("N is larger than the size of the list");
        }
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println(depictBegin.begin(head, 3));  // Output: 30
    }

}
