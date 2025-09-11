package Strings;

import java.util.Arrays;

public class CountWordsInString {
    public static void main(String[] args) {
        String s="WHat are YOu DoiNG";
        String g[]=s.trim().split(" ");
        int count=g.length;
        System.out.println(count);
    }
}
