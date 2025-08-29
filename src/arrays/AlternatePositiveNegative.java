package arrays;

import java.util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AlternatePositiveNegative {

    static void Implement(int[] arr) {

        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        ArrayList<Integer> positive = new ArrayList<>();
        ArrayList<Integer> negative = new ArrayList<>();

        // Separate positive and negative numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positive.add(arr[i]);
            } else {
                negative.add(arr[i]);
            }
        }

        int i = 0, p = 0, n = 0;

        // Alternate placing positive and negative
        while (p < positive.size() && n < negative.size()) {
            arr[i++] = positive.get(p++);
            arr[i++] = negative.get(n++);
        }

        // Add remaining positives
        while (p < positive.size()) {
            arr[i++] = positive.get(p++);
        }

        // Add remaining negatives
        while (n < negative.size()) {
            arr[i++] = negative.get(n++);
        }

        // Print the rearranged array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[][] testCases = {
                {1, 2, 3, -4, -1, 4},             // Mix of positives and negatives
                {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}, // More positives than negatives
                {-1, -2, -3, 4, 5},               // More negatives
                {1, 2, 3, 4},                     // All positive
                {-1, -2, -3, -4},                 // All negative
                {},                               // Empty array
                {0, -1, 2, -3, 4, -5}             // Includes 0
        };

        // Run and print all test cases
        for (int i = 0; i < testCases.length; i++) {
            System.out.println("Test Case " + (i + 1) + ": Original Array: " + Arrays.toString(testCases[i]));
            Implement(testCases[i]);
            System.out.println();
        }
    }
}

