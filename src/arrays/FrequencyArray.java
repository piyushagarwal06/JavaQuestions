package arrays;

import java.util.Scanner;
public class FrequencyArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int freq[]=new int[n+1];
        for(int i=0;i<n;i++){
            freq[arr[i]]++;//assuming that every element in arr[] is between 0 and n, because your freq[] array is of size n+1. But:If arr[i] contains a value greater than n, this will cause:Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " occurs " + freq[i] + " times");
            }
        }

        //for-each loop gives you only the values, not the indices.
//        for(int s:freq){
//            if(s>0)
//            System.out.println(s);
//        }
    }
}
