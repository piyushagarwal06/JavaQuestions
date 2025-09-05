package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class IndianCoins {
    public static void main(String[] args) {
        Integer []coins={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());//The method Arrays.sort(array, Comparator)
        // works only on arrays of reference types (objects), like Integer[]. It doesn't work with primitive arrays like int[].

        int countOfCoins=0;
        int amount=590;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    countOfCoins++;
                     ans.add(coins[i]);
                     amount-=coins[i];
                }
            }
        }
        System.out.println(countOfCoins);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
}
