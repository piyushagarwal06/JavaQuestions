package Stack;

import java.util.Stack;

public class deleteFromAnyIndex {
    public static void removeAtIndex(Stack<Integer> stack, int index) {
        if (index < 0 || index >= stack.size()) {
            throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        Stack<Integer> temp = new Stack<>();
        int n = stack.size();

        for (int i = 0; i < n - index - 1; i++) {
            temp.push(stack.pop());
        }

        int removed = stack.pop();
        System.out.println("Removed element: " + removed);


        while (!temp.isEmpty()) {
            stack.push(temp.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Stack: [10,20,30,40] (40 == top)

        System.out.println("Original Stack: " + stack);

        removeAtIndex(stack, 1); // removes index 1 → 20

        System.out.println("Stack after removal: " + stack);
    }
}
