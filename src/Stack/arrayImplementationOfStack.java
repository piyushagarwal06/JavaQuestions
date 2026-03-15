package Stack;

import java.util.Stack;

public class arrayImplementationOfStack {

    static class Stack{
        private int arr[]=new int[5];
        int idx=0;

        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }

        int peek(){
            if(idx==0){
                System.out.println("Stack is empty");
                return Integer.MIN_VALUE;
            }
            return arr[idx-1];
        }

        int pop(){
            if(idx==0){
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            int top=arr[idx-1];
            arr[idx-1]=0;
            idx--;
            return top;
        }

        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
        }

        int size(){
            return idx;
        }

        boolean isEmpty(){
            if(size()==0 || idx==0){
                return true;
            }
            else return false;
        }

        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }


    }
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(4);
        st.push(5);
        st.push(1);
        st.display();
        st.pop();
        System.out.println(st.size());
        st.display();

        st.push(4);
        st.push(5);
        st.push(1);
        st.display();

        st.size();
        System.out.println(st.isFull());
        st.push(78454);

    }
}
