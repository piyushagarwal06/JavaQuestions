package arrays;

import java.util.HashSet;

public class RemoveDuplicateElementsUsingHashSet {
    public static void main(String[] args) {
        int arr[]={11,22,33,22,33,11,44,44};

        HashSet<Integer> mp=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            mp.add(arr[i]);
        }

        for(int i:mp){
            System.out.print(i+" ");
        }
    }

}
