package arrays;

import java.util.Scanner;

public class RotateArrayByKPositionsRight {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        for(int n:arr){
            System.out.print(n+" ");
        }
        int k=sc.nextInt();
        k%=arr.length;

        for(int i=0;i<k;i++){
            int last=arr[arr.length-1];
            for(int j=arr.length-1;j>0;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=last;
        }
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
