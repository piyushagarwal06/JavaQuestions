package Stack;

import java.util.Stack;

public class reverseStackUsingRecursion {
    public static void reverseStack(Stack<Integer> stack) {
        if (stack.isEmpty()) return;

        int top = stack.pop();       // remove top
        reverseStack(stack);         // reverse the rest
        insertAtBottom(stack, top);  // insert top at bottom
    }

    // Helper to insert element at bottom of stack
    public static void insertAtBottom(Stack<Integer> stack, int value) {
        if (stack.isEmpty()) {
            stack.push(value);
            return;
        }

        int top = stack.pop();
        insertAtBottom(stack, value);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4); // Stack: [1,2,3,4] (4 is top)

        System.out.println("Original Stack: " + stack);

        reverseStack(stack);

        System.out.println("Reversed Stack: " + stack);
    }
}
