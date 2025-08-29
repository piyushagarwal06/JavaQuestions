package arrays;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        int []grr={3,4,5,6,7};

        HashSet<Integer> mp=new HashSet<>();

        for(int n:arr){
            mp.add(n);
        }
        for(int n:grr){
            mp.add(n);
        }
        int []result=new int[mp.size()];
        int index = 0;
        for (int num : mp) {
            result[index++] = num;
        }
        for(int n:result){
            System.out.print(n+" ");
        }
    }
}
