package Stack;
//Write a program to check whether the following string of brackets is balanced.
import java.util.Stack;

public class balancingBrackets {
    static boolean check(String str){
        Stack<Character> st=new Stack<>();
        for( char ch: str.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                st.push(ch);
            }
            else {
                if (ch == ')' || ch == '}' || ch == ']') {
                    if (st.isEmpty()) return false;
                }
                char top = st.pop();

                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String input = "{[()]}";

        if (check(input)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}
