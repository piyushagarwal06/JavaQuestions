package arrays;

public class MisingNumberInSeries {
    public static void main(String[] args) {
        int arr[]={1,2,4,5,6};
        int n=arr.length+1;
        int totalSum=n*(n+1)/2;

        for(int a:arr){
            totalSum-=a;
        }
        System.out.println("Missing number is "+totalSum);//3
    }

}
