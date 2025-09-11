package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int left = 0;
        int right = s.length() - 1; // should be length - 1

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) { // use != instead of .equals for char comparison
                System.out.println("Not a palindrome");
                return;
            }
            left++;
            right--;
        }

        System.out.println("String is a palindrome");
    }
}
