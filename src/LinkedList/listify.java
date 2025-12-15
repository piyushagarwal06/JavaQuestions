package LinkedList;
import java.util.Scanner;

//Create a linked list based on user input until -1 is entered.
public class listify {

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

         // insert at end
         void insertAtEnd(int val) {
             Node temp = new Node(val);
             if (head == null) {
                 head = temp;
             }
             else {
                 tail.next = temp;
             }
             tail = temp;
         }

            // insert at beginning
            void insertAtBegin(int val) {
                Node temp = new Node(val);
                if (head == null) {
                    head = tail = temp;
                } else {
                    temp.next = head;
                    head = temp;
                }
            }

            // get size
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

            // insert at specific index
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
        }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       int index = 0;
       apply ll=new apply();
       while(num!=-1){
           ll.insertAt(index, num);   // correct call
           index++;                   // move to next index
           num = sc.nextInt();
       }
       ll.display();
    }
}
