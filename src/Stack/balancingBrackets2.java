package Stack;
//Find the minimum number of brackets to remove to make the string balanced.

import java.util.Stack;

public class balancingBrackets2 {

    static int balanceCount(String str){
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char ch: str.toCharArray()){
            if(ch=='(' || ch== '{' || ch=='['){
                st.push(ch);
            }
            else {
                if (ch == ')' || ch == '}' || ch == ']') {
                    if (st.isEmpty()) {
                        count++;
                    }
                     else {
                            char top = st.peek();

                            if ((ch == ')' && top == '(') ||
                                    (ch == '}' && top == '{') ||
                                    (ch == ']' && top == '[')) {

                                st.pop();
                            }
                            else {
                                st.pop();   // remove wrong opening bracket
                                count++;
                            }
                     }
                }
            }
        }
        count += st.size(); // leftover opening brackets
        return count;
    }
    public static void main(String[] args) {
        String input = "{[(()]}}";
        int c=balanceCount(input);
        System.out.println(c);

    }
}
