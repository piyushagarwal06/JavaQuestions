package Strings;

public class TitleCaseConversion {
    public static void main(String[] args) {
        String s = "this is java";
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)));
                result.append(word.substring(1)).append(" ");
            }
        }
        System.out.println(result.toString().trim());
    }
}
