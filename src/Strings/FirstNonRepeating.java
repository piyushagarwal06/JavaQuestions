package Strings;
import java.util.*;

 public class FirstNonRepeating {
        public static Character firstNonRepeatingChar(String input) {
            Map<Character, Integer> countMap = new LinkedHashMap<>();

            // Count occurrences of each character
            for (char c : input.toCharArray()) {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }

            // Find the first character with count 1
            for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
                if (entry.getValue() == 1) {
                    return entry.getKey();
                }
            }

            // If all characters repeat, return null or some default
            return null;
        }

        public static void main(String[] args) {
            String input = "swiss";
            Character result = firstNonRepeatingChar(input);

            if (result != null) {
                System.out.println("First non-repeating character: " + result);
            } else {
                System.out.println("No non-repeating character found.");
            }
        }
 }
