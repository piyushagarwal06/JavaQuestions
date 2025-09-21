package dynamicProgramming;

import java.util.HashMap;

public class ClimbingStairsMemoization {
    static HashMap<Integer,Integer> memo=new HashMap<>();

    static int CountWays(int n){
        if(n<0) return 0;
        if(n==0) return 1;
        if(memo.containsKey(n)) return memo.get(n);
        int result=CountWays(n-1)+ CountWays(n-2);
        memo.put(n,result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println(CountWays(5));
    }
}
