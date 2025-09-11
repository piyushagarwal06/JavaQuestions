package Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char []arr=s.toCharArray();
        int left = 0;
        int right = arr.length - 1;
        while (left<right){
            char temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++; right--;
        }
        // Convert back to string and print
        String reversed = new String(arr);
        System.out.println("Reversed string: " + reversed);
    }
}
