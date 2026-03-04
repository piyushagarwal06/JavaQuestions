package LinkedList;

import java.util.Scanner;

//Q->Delete entire linked list.
// Setting head and tail to null removes all references to the nodes, and the garbage collector automatically frees the memory.
// This is why this method effectively deletes the entire linked list.
public class deleteEntire {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class apply {
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void insertAtBegin(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
        }

        int size() {
            //System.out.println("size of linked list is");
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;
            }
            return count;
        }

        void insertAt(int idx, int val) {
            Node temp = new Node(val);

            if (idx < 0) {
                System.out.println("Index cannot be negative");
                return;
            }

            if (head == null) {
                head = tail = temp;
                return;
            }

            if (idx == 0) {
                insertAtBegin(val);
                return;
            }

            if (idx == size()) {
                insertAtEnd(val);
                return;
            }

            Node a = head;

            for (int i = 1; i <= idx - 1; i++) {
                a = a.next;
                if (a == null) {
                    System.out.println("Index out of bounds");
                    return;
                }
            }

            temp.next = a.next;
            a.next = temp;

            if (temp.next == null) {
                tail = temp;
            }
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("NULL");
        }

        void deleteList() {
            head = null;
            tail = null;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        apply ll = new apply();

        int num = sc.nextInt();
        int index = 0;

        while (num != -1) {
            ll.insertAt(index, num);
            index++;
            num = sc.nextInt();
        }

        ll.display();

        ll.deleteList();

        ll.display();
    }
}

