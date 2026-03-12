package Stack;

import java.util.Stack;

public class basics {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(99);
        st.push(33);
        st.push(88);
        st.push(77);
        System.out.println(st);
        System.out.println(st.peek());

        st.pop();
        System.out.println(st);

        System.out.println(st.size());

        while(st.size()>1){
            st.pop();
        }
        System.out.println(st);
        System.out.println(st.size());

        System.out.println(st.isEmpty());




    }
}
