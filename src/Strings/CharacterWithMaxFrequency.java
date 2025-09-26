package Strings;

import java.util.HashMap;

public class CharacterWithMaxFrequency {
    public static void main(String[] args) {
        String s = "Declcare";
        HashMap<Character, Integer> mp = new HashMap<>();

        // Step 1: Build frequency map
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Find max frequency
        int maxFreq = 0;
        for (int freq : mp.values()) {
            if (freq > maxFreq) {
                maxFreq = freq;
            }
        }

        // Step 3: Print all characters with max frequency
        System.out.println("Characters with max frequency (" + maxFreq + " times):");
        for (HashMap.Entry<Character, Integer> entry : mp.entrySet()) {
            if (entry.getValue() == maxFreq) {
                System.out.println(entry.getKey());
            }
        }
    }
}
