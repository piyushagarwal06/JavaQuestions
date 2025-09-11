package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String sentence="AKHAND BHARAT KI JAY";
        String []arr=sentence.split(" ");
        StringBuilder result=new StringBuilder();

        for( String s:arr){
            String reverseWord=new StringBuilder(s).reverse().toString();
            result.append(reverseWord).append(" ");
        }
        System.out.println(result.toString().trim());
    }
}
