package Strings;

public class CheckAnagram {
    public static void main(String[] args) {
        String s="listen";
        String p="silent";
        // First, check if lengths are equal
        if (s.length() != p.length()) {
            System.out.println("Not anagram");
            return;
        }
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i) - 'a']++;
            freq[p.charAt(i) - 'a']--;
        }
        // Check if all frequencies are 0
        boolean isAnagram = true;
        for (int count : freq) {
            if (count != 0) {
                isAnagram = false;
                break;
            }
        }
        // Output result
        if (isAnagram) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not anagram");
        }

    }
}
