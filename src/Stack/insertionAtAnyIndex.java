package Stack;

import java.util.Stack;

public class insertionAtAnyIndex {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(99);
        st.push(33);
        st.push(88);
        st.push(77);
        System.out.println(st);
        int idx=2;
        int x=7887;
        Stack<Integer>temp=new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(x);
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
