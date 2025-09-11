package Strings;

import java.util.Arrays;

public class SplitUsingDelimiters {
    public static void main(String[] args) {
        String s= "WHat are YOu DoiNG";
        String[]words=s.split(",");
        for(String g:words){
            System.out.print(g);
        }
        System.out.println();
        // Or print as an array
        System.out.println("As array: " + Arrays.toString(words));//As array: [WHat are YOu DoiNG] =ans


    }
}
