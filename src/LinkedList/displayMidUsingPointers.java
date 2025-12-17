package LinkedList;


//Find the middle of a linked list (2-pointer technique).
public class displayMidUsingPointers {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class displayMid {
        Node head = null;
        Node tail = null;

        static Node depict(Node head) {
            Node fast = head;
            Node slow = head;

            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }
    }

        public static void main(String[] args) {
            // Create a sample list: 1 -> 2 -> 3 -> 4 -> 5
            Node head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);
            head.next.next.next.next.next = new Node(110);

            Node middle = displayMid.depict(head);
            System.out.println("Middle Node Value: " + middle.data);
        }
}
