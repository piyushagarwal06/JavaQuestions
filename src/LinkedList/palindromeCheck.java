package LinkedList;

public class palindromeCheck {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static boolean isPalindrome(Node head) {

        if (head == null || head.next == null)
            return true;

        // Step 1: Find middle (slow & fast pointer)
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Step 2: Reverse second half
        Node prev = null;
        while (slow != null) {
            Node nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // Step 3: Compare both halves
        Node firstHalf = head;
        Node secondHalf = prev;

        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data)
                return false;

            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    public static void main(String[] args) {
        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = new Node(30);
        headA.next.next.next = new Node(20);
        headA.next.next.next.next = new Node(10);

        boolean result = isPalindrome(headA);

        System.out.println("Is Palindrome? " + result);
    }
}
