package Strings;

import java.util.HashMap;
//import java.util.Map;

public class FrequencyCountInSentence {
    public static void main(String[] args) {
        String sentence = "Hello World 2025!";

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> freqMap = new HashMap<>();

        // Loop through each character
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            // If character already exists in map, increment its count
            if (freqMap.containsKey(ch)) {
                freqMap.put(ch, freqMap.get(ch) + 1);
            } else {
                // Otherwise, add it with count 1
                freqMap.put(ch, 1);
            }
        }
        // Print character frequencies
        for (HashMap.Entry<Character, Integer> entry : freqMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}

