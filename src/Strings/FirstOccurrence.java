package Strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FirstOccurrence {
    public static String keepFirst(String str){
        HashSet<Character>mp=new HashSet<>();

        List<Character> l=new ArrayList<>();

        for(char c:str.toCharArray()){
            if(!mp.contains(c)){
                mp.add(c);
                l.add(c);
            }
        }
        StringBuilder sb=new StringBuilder();
        for(char c:l){
            sb.append(c);
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        String s="programming";
        String output = keepFirst(s);
        System.out.println("Original: " + s);
        System.out.println("Unique (first occurrences only): " + output);
    }
}
