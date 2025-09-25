package Strings;

import java.util.*;

public class SortWithFreq {
    public static void main(String[] args) {
        String s = "Declcare";
        HashMap<Character, Integer> mp = new HashMap<>();

        // Step 1: Build frequency map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(mp.entrySet());

        // Step 3: Sort the list by frequency in descending order
        entryList.sort((a, b) -> b.getValue() - a.getValue());

        System.out.println("Characters sorted by frequency:");
        for (Map.Entry<Character, Integer> entry : entryList) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
