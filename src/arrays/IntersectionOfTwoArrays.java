package arrays;

import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read sizes
        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        // Edge Case 1: Empty arrays
        if (size1 == 0 || size2 == 0) {
            System.out.println("One or both arrays are empty. No intersection.");
            return;
        }

        int[] arr = new int[size1];
        int[] grr = new int[size2];

        // Input elements for arr
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Input elements for grr
        for (int i = 0; i < grr.length; i++) {
            grr[i] = sc.nextInt();
        }

        // Edge Case 2: All values are unique, but no intersection
        HashSet<Integer> set = new HashSet<>();
        for (int n : arr) {
            set.add(n);
        }

        HashSet<Integer> resultSet = new HashSet<>();
        for (int n : grr) {
            if (set.contains(n)) {
                resultSet.add(n);
            }
        }

        // Edge Case 3: No intersection found
        if (resultSet.isEmpty()) {
            System.out.println("No intersection found.");
            return;
        }

        // Convert HashSet to array (optional — not strictly needed unless required)
        int[] result = new int[resultSet.size()];
        int index = 0;
        for (int n : resultSet) {
            result[index++] = n;
        }

        // Output
        System.out.print("Intersection: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}
