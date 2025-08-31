package arrays;

public class BuySellStock {
    public static void main(String[] args) {
        int []arr={7,1,5,3,6,4};
        int buy=Integer.MAX_VALUE;
        int maxSell=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<buy){
                buy=arr[i];
            }
            else{
                int profit = arr[i] - buy;
                if (profit > maxSell) {
                    maxSell = profit;
                }
            }
        }

        System.out.println(maxSell);
    }
}
