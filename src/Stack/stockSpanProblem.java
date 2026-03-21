package Stack;

import java.util.Stack;

public class stockSpanProblem {

    static int[] ssp(int price[]){

        Stack<Integer> st=new Stack<>();
        int span[]=new int[price.length];

        st.push(0);
        span[0]=1;

        for(int i=1;i< price.length;i++){
            while(st.size()>0 && price[st.peek()]<=price[i]){
                st.pop();
            }
            if (st.isEmpty()) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek();
            }
            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {

        int price[] = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;

        int span[] = ssp(price);

        for (int s : span) {
            System.out.print(s + " ");
        }
    }
}
