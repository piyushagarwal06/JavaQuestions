package Stack;

import java.util.Stack;
//Given an array of integers arr of size n, find the Next Smaller Element (NSE) to the right for every element in the array.
// The Next Smaller Element for an element arr[i] is the first element to the right of arr[i] that is smaller than it.
// If no such element exists, return -1 for that position.
public class nextSmallerElement {
    static int[] nextSmaller(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {

            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }

            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }

            stack.push(arr[i]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 8, 5, 2, 25};
        int[] res = nextSmaller(arr);

        System.out.println("Next Smaller Elements:");
        for (int x : res) {
            System.out.print(x + " ");
        }
    }
}
