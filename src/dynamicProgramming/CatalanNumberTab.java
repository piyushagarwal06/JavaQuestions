package dynamicProgramming;

import java.util.Arrays;

public class CatalanNumberTab {
    public static int catalanTab(int n){
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;

        for(int i=2;i<=n;i++){
            for(int j=0;j<i;j++){
                dp[i]+=dp[j]*dp[i-1-j];
            }
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=40;
        //int []dp=new int [n+1];
        //Arrays.fill(dp,-1);
        System.out.println(catalanTab(n));
    }
}
