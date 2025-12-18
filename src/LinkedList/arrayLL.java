package LinkedList;

public class arrayLL {
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
        }
    }

    // Helper function to create a linked list from an array of values
    static Node createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        Node head = new Node(arr[0]);
        Node tail = head;
        for (int i = 1; i < arr.length; i++) {
            tail.next = new Node(arr[i]);
            tail = tail.next;
        }
        return head;
    }

    // Helper function to traverse a linked list
    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Example: array of 3 linked lists
        int[][] arrays = {
                {1, 2, 3},
                {4, 5},
                {6, 7, 8, 9}
        };

        int k = arrays.length; // number of linked lists
        Node[] listArray = new Node[k]; // array of linked list heads

        // Build each linked list and store head in listArray
        for (int i = 0; i < k; i++) {
            listArray[i] = createLinkedList(arrays[i]);
        }

        // Traverse each linked list
        for (int i = 0; i < k; i++) {
            System.out.print("List " + (i+1) + ": ");
            printList(listArray[i]);
        }
    }
}
