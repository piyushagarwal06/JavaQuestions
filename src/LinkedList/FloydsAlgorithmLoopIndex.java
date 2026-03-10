package LinkedList;

public class FloydsAlgorithmLoopIndex {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static Node findCycleStart(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast)
                break;
        }

        if (fast == null || fast.next == null)
            return null;

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;
    }
    public static int findIndex(Node head, Node start) {
        int index = 0;
        Node temp = head;

        while (temp != start) {
            temp = temp.next;
            index++;
        }
        return index;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);


        head.next.next.next.next.next = head.next.next;

        Node start = findCycleStart(head);

        if (start != null) {
            System.out.println("Cycle starts at node: " + start.val);
            System.out.println("Index of loop start: " +
                    findIndex(head, start));
        } else {
            System.out.println("No Cycle");
        }
    }
}
