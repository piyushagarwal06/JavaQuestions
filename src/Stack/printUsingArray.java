package Stack;

import java.util.Stack;

public class printUsingArray {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(99);
        st.push(33);
        st.push(88);
        st.push(77);
        System.out.println(st);
        int n=st.size();
        int[]arr=new int[n];
        for (int i=n-1;i>=0;i--){
            arr[i]=st.pop();
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
            st.push(arr[i]);
        }
    }

}

