package LinkedList;

//You are given two singly linked lists. They may merge at some point.
//Find the node where they intersect.

public class intersectionOfTwoLL_02 {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    static Node intersection(Node headA,int countA, Node headB,int countB){
        if(headA==null || headB==null) return null;
        Node tempA = headA, tempB = headB;
        if(countA>countB){
            int diff=countA-countB;
            for(int i=0;i<diff;i++){
                tempA=tempA.next;
            }
        }
        else {
            int diff = countB - countA;
            for (int i = 0; i < diff; i++) tempB = tempB.next;
        }
        while(tempA.next!=null && tempB.next!=null){
            if (tempA == tempB) return tempA;  // Intersection found
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return null;
    }

    static int size(Node head){
        Node temp=head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        Node headA = new Node(10);
        headA.next = new Node(20);
        headA.next.next = new Node(30);
        headA.next.next.next = new Node(40);
        headA.next.next.next.next = new Node(50);


        Node headB = new Node(15);
        headB.next = headA.next.next.next; // point to node 40 in list A

        System.out.println("List A:");
        printList(headA);

        System.out.println("List B:");
        printList(headB);

        int countA=size(headA);
        int countB=size(headB);

        // Find intersection
        Node intersection = intersection(headA,countA, headB,countB);
        if (intersection != null) {
            System.out.println("Intersection Node Data: " + intersection.data);
        } else {
            System.out.println("No intersection found.");
        }
    }

}
