package LinkedList;

public class Implementation {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    static class linkedlist{
        Node head=null;
        Node tail=null;

        //insert at end
        void insertAtEnd(int val){
            Node temp=new Node(val);
            if (head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }

        // Insert at beginning
        void insertAtBegin(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        // Get size
        int size(){
            System.out.println("size of linked list is");
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        // Insert at specific index
        void insertAt(int idx,int val){
            Node temp=new Node(val);
            if (idx < 0) {
                System.out.println("Index cannot be negative");
                return;
            }

            if(head==null){
                head=tail=temp;
                return;
            }

            if(idx==0){
                insertAtBegin(val);
                return;
            }

            if(idx==size()){
                insertAtEnd(val);
                return;
            }

            Node a=head;
            for(int i=1;i<=idx-1;i++) {
                a = a.next;
                if (a == null) {           // <-- ADD THIS
                    System.out.println("Index out of bounds");
                    return;
                }
            }
            temp.next = a.next;
            a.next = temp;

            // If inserted at end
            if (temp.next == null) {
                tail = temp;
            }
        }

        // Delete at any index
        void deleteAt(int idx){
            if (head == null) {
                System.out.println("List is empty");
                return;
            }

            if(idx==0){
                head=head.next;
                if (head == null) tail = null; // list becomes empty
                return;
            }

            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }

        // Display list
        void display(){
            Node temp=head;
            System.out.println("elements of linked list are");
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        // Search for a value, return index or -1
        int search(int val) {
            Node temp = head;
            int idx = 0;
            while (temp != null) {
                if (temp.data == val) return idx;
                temp = temp.next;
                idx++;
            }
            return -1;
        }

        // Get value at specific index
        int get(int idx) {
            if (idx < 0) return -1;
            Node temp = head;
            int i = 0;
            while (temp != null && i < idx) {
                temp = temp.next;
                i++;
            }
            return (temp != null) ? temp.data : -1;
        }

        boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(5);
        ll.insertAtEnd(33);
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);

        ll.insertAtBegin(53);
        ll.display();
        System.out.println(ll.size());

        System.out.println();
        ll.insertAt(1,2);
        ll.display();
        System.out.println(ll.size());

        System.out.println();
        ll.deleteAt(2);
        ll.display();
        System.out.println(ll.size());

        System.out.println(ll.search(33));
        System.out.println("Value at index 1: " + ll.get(1));
        System.out.println("Is list empty? " + ll.isEmpty());
    }
}