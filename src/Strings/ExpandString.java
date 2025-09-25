package Strings;

public class ExpandString {
    public static void main(String[] args) {
        String s="a3b2";
        char []c=s.toCharArray();
        StringBuilder sb=new StringBuilder(s);
        StringBuilder ans=new StringBuilder();
        for(int i=0;i< sb.length();i++){
            if(Character.isDigit(sb.charAt(i))){
                for(int j=0;j<Character.getNumericValue(sb.charAt(i));j++){
                    ans.append(sb.charAt(i-1));
                }
            }
        }
        System.out.println(ans.toString());
    }
}
