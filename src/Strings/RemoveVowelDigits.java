package Strings;

public class RemoveVowelDigits {
    public static void main(String[] args) {
        String sentence = "This is a test sentence 123 with vowels and digits!";
        sentence=sentence.replaceAll("[aeiou\\d]","");
        System.out.println(sentence);

    }
}
