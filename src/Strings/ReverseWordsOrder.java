package Strings;
import java.util.Scanner;

public class ReverseWordsOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get input sentence from user
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        // Split the sentence into words
        String[] words = sentence.trim().split("\\s+"); // Handles multiple spaces

        // Reverse the array of words in-place
        int left = 0;
        int right = words.length - 1;
        while (left < right) {
            // Swap words[left] and words[right]
            String temp = words[left];
            words[left] = words[right];
            words[right] = temp;

            left++;
            right--;
        }

        // Join the words back into a string
        StringBuilder reversedSentence = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            reversedSentence.append(words[i]);
            if (i != words.length - 1) {
                reversedSentence.append(" ");
            }
        }

        // Output result
        System.out.println("Reversed word order: " + reversedSentence);
    }
}
