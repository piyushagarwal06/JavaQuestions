package Stack;

//Given an array of integers arr of size n, find the Next Greater Element (NGE) for every element in the array.
//The Next Greater Element for an element arr[i] is the first element to the right of arr[i] that is greater than arr[i].
//If no such element exists, return -1 for that position.

import java.util.Stack;

public class findNextGreaterElement2 {

    static int[] nge(int []arr){
        Stack<Integer> st=new Stack<>();
        int []result=new int[arr.length];
//        result[0]=arr[-1];
        for(int i= arr.length-1;i>=0;i--){
            while(st.size()>0 && arr[i]>st.peek()){
                st.pop();
            }
            if(st.size()==0){
                result[i]=-1;
            }
            else {
                result[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};

        int[] res = nge(arr);

        System.out.println("Next Greater Elements:");
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
