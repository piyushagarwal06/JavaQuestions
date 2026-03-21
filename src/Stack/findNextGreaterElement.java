package Stack;

import java.util.HashMap;
import java.util.Stack;
/*
You are given two integer arrays nums1 and nums2.
All elements in nums1 are present in nums2.
All elements in nums2 are distinct.
For each element in nums1, find the next greater element in nums2.
The next greater element of a number x in nums2 is the first element to the right of x that is greater than x.
If such an element does not exist, return -1 for that number.
Return an array ans where:
ans[i] = next greater element of nums1[i] in nums2
 */
public class findNextGreaterElement {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int ans[] = new int[nums1.length];

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mp = new HashMap<>();

        // Find next greater elements for nums2
        for(int num : nums2){
            while(!st.isEmpty() && st.peek() < num){
                int top = st.pop();
                mp.put(top, num);
            }
            st.push(num);
        }

        // Build answer for nums1
        for(int i = 0; i < nums1.length; i++){
            ans[i] = mp.getOrDefault(nums1[i], -1);
        }

        return ans;
    }

    public static void main(String[] args) {

        int nums1[] = {4, 1, 2};
        int nums2[] = {1, 3, 4, 2};

        int result[] = nextGreaterElement(nums1, nums2);

        System.out.println("Next Greater Elements:");

        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
