package arrays;
import java.util.Scanner;
public class RotateArrayByKpositionsLeft {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5};
        for(int n:arr){
            System.out.print(n+" ");
        }
        int k=sc.nextInt();
        k%=arr.length;

        for(int i=0;i<k;i++){
            int first=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=first;
        }

        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
