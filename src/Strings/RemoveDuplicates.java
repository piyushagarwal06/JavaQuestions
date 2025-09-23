package Strings;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "aabbccffddee";

        // Convert to char array and sort
        char[] chars = s.toCharArray();
        Arrays.sort(chars); // Sorting brings duplicates together

        StringBuilder result = new StringBuilder();
        result.append(chars[0]); // Always include the first character

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[i - 1]) {
                result.append(chars[i]);
            }
        }
        System.out.println("String after removing duplicates : " + result.toString());
    }
}
//alternate approach
/*
import java.util.HashSet;
public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "aabbccddee";
        StringBuilder result = new StringBuilder();
        HashSet<Character> seen = new HashSet<>();

        for (char ch : s.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                result.append(ch);
            }
        }

        System.out.println("String without duplicates: " + result);
    }
}
*/
