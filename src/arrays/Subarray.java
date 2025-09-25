package arrays;

public class Subarray {
    public static void printAllSubarrays(int[] arr) {
        int n = arr.length;

        // Outer loop: starting index
        for (int start = 0; start < n; start++) {
            // Inner loop: ending index
            for (int end = start; end < n; end++) {
                // Print subarray from start to end
                System.out.print("[");
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i]);
                    if (i < end) System.out.print(", ");
                }
                System.out.println("]");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};

        System.out.println("All subarrays:");
        printAllSubarrays(arr);
    }
}
