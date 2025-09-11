package Strings;

public class CountWhitespacesDigits {
    public static void main(String[] args) {
        String s="India that is Bharat";
        int digits=0,whitespaces=0,letters=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isDigit(ch)) digits++;
            else if (Character.isWhitespace((ch))) whitespaces++;
            else if (Character.isLetter(ch)) letters++;
        }
        System.out.println("letters= "+letters +" whitespaces= "+whitespaces+" digits= "+digits );
    }
}
