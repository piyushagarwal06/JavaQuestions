package arrays;
//Given an integer array nums sorted in non-decreasing order, remove some duplicates in-place such that each unique element appears at most twice.
// The relative order of the elements should be kept the same.
//Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums.
// More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result.
// It does not matter what you leave beyond the first k elements.
//Return k after placing the final result in the first k slots of nums.
//Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.


//LEET-CODE--80

import java.util.*;
public class RemoveDuplicatesFromSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {
            HashMap<Integer,Integer>mp=new LinkedHashMap<>();
            for(int i=0;i<nums.length;i++){
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
            }
            int index = 0;
            for (HashMap.Entry<Integer, Integer> entry : mp.entrySet()) {
                int value = entry.getKey();
                int freq = Math.min(entry.getValue(), 2); // Allow max 2

                for (int i = 0; i < freq; i++) {
                    nums[index++] = value;
                }
            }
            // int index=0;
            // for(HashMap.Entry<Integer,Integer> entry:mp.entrySet()){
            //     if(entry.getValue()<=2){
            //         nums[index++] = entry.getKey();
            //     }
            // }
            return index;
        }
    }
    //ALTERNATIVE SOLUTION (BOTH HAVE TC=SC=O(n))
    //class Solution {
    //    public int removeDuplicates(int[] nums) {
    //        Map<Integer, Integer> count = new HashMap<>();
    //        int k = 0;
    //
    //        for (int num : nums) {
    //            count.put(num, count.getOrDefault(num, 0) + 1);
    //            if (count.get(num) <= 2) {
    //                nums[k] = num;
    //                k++;
    //            }
    //        }
    //
    //        return k;
    //    }
    //}
}
