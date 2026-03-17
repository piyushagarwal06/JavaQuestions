package Stack;
import java.util.Stack;
public class insertionAtAnyIndexRecursively {

        public  static void insertAtIndex(Stack<Integer> st, int index, int val) {

            // Base case: when stack size equals index
            if (st.size() == index) {
                st.push(val);
                return;
            }

            int top = st.pop();


            insertAtIndex(st, index, val);


            st.push(top);
        }

        public static void main(String[] args) {

            Stack<Integer> st = new Stack<>();


            st.push(10);
            st.push(20);
            st.push(30);
            st.push(40);


            insertAtIndex(st, 2, 25);

            System.out.println(st);
        }
    }
