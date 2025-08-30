package arrays;

public class KadanesAlgorithm {
    public class MaxSubarraySum {

        public static int maxSubArray(int[] nums) {
            if (nums == null || nums.length == 0)
                throw new IllegalArgumentException("Array is empty");

            int maxCurrent = nums[0];
            int maxGlobal = nums[0];

            for (int i = 1; i < nums.length; i++) {
                maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
                maxGlobal = Math.max(maxGlobal, maxCurrent);
            }

            return maxGlobal;
        }

        public static void main(String[] args) {
            int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
            System.out.println("Maximum subarray sum: " + maxSubArray(arr));
        }
    }
}
