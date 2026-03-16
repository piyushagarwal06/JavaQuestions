package Stack;

public class LLImplementationOfStack {
    static class Node{
        int val;
        Node next;
        Node(int val){
            this.val=val;
        }
    }
    static class LLStack{
        Node head= null;
        int size=0;

        void push(int x){
            Node temp = new Node(x);
            temp.next=head;
            head=temp;
            size++;
        }

        int pop(){
            if(head==null){
                System.out.println("Stack is empty");
                return -1;
            }
            int x=head.val;
            head=head.next;
            size--;
            return x ;
        }

        int peek(){
            if(head==null){
                System.out.println("Stack is empty!");
                return -1;
            }
            return head.val;
        }
        void displayrec(Node h){
            if(h==null) return;
            displayrec(h.next);
            System.out.print(h.val+" ");
        }
        void display(){
            displayrec(  head);
        }
        void displayRev(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

    }
    public static void main(String[] args) {
        LLStack st=new LLStack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.displayRev();
        st.pop();
        System.out.println(st.size());
        st.displayRev();

        st.push(4);
        st.push(5);
        st.push(1);
        st.displayRev();
        st.display();

        st.size();
    }
}
