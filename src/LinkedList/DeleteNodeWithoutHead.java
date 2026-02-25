package LinkedList;

//You are given a pointer/reference to a node in a singly linked list, but not the head of the list. Delete that node from the linked list.
public class DeleteNodeWithoutHead {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void deleteNode(Node node) {
        if (node == null || node.next == null) {
            System.out.println("Cannot delete the last node with this method!");
            return;
        }

        // Copy data from next node
        node.data = node.next.data;

        // Skip the next node
        node.next = node.next.next;
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

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Original List:");
        printList(head);

        Node nodeToDelete = head.next.next;
        deleteNode(nodeToDelete);

        System.out.println("List After Deletion:");
        printList(head);
    }
}
