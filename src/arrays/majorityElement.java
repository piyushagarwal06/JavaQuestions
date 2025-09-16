package arrays;

import java.util.HashMap;
//Given an array nums of size n, return the majority element.
//The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array
public class majorityElement {
    static int Implementation(int []arr){
        HashMap<Integer,Integer> mp=new HashMap<>();

        // Count the frequency of each element
        for(int s:arr){
            mp.put(s,1+ mp.getOrDefault(s,0));

            // If the current number is the majority, return it early
            if(mp.get(s)> arr.length/2){
                return s;
            }
        }
        // According to the problem, a majority element always exists
        return -1; // This line should theoretically never be reached
    }
    public static void main(String[] args) {
        //majorityElement sol = new majorityElement();

        int[] nums1 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element: " + majorityElement.Implementation(nums1)); // Output: 2

        int[] nums2 = {3, 3, 4};
        System.out.println("Majority element: " + majorityElement.Implementation(nums2)); // Output: 3
    }
}
