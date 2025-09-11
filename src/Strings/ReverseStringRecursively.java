package Strings;

import java.util.Scanner;

public class ReverseStringRecursively {
    static String rev(String s){
        if(s.length()<=1) return s;
        // Recursive case: reverse the rest of the string and add first character at the end
        return rev(s.substring(1)) + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(rev(s));
    }
}
