package dynamicProgramming;

import java.util.HashMap;

public class FibonacciMemoization {
    static HashMap<Integer,Integer> memo=new HashMap<>();

    static int fib(int n){
        if(n<=1) return n; //base case
        if(memo.containsKey(n)) return memo.get(n);
        int result= fib(n-1) + fib(n-2);
        memo.put(n,result);
        return result;
    }
    public static void main(String[] args) {
        System.out.println((fib(10)));

    }
}
