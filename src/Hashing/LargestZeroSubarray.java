package Hashing;

import java.util.HashMap;
//Find subarray of max length whose sum is 0
public class LargestZeroSubarray {
    public static void main(String[] args) {
        int arr[]={15,-2,2,-8,1,7,10,23};
        HashMap<Integer,Integer> mp=new HashMap<>();

        int sum=0;
        int length=0;

        for(int j=0;j<arr.length;j++){
            sum+=arr[j];
            if(mp.containsKey(sum)){
                length=Math.max(length,j-mp.get(sum));
            }
            else {
                mp.put(sum,j);
            }
        }
        System.out.println(length);
    }
}
