package arrays;

import java.util.Scanner;

public class ReadStrings_Print {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        for(String s:arr){
            System.out.println(s);
        }
    }
}
