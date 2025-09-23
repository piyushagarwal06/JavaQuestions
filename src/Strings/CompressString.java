package Strings;

public class CompressString {
    public static void main(String[] args) {
        String s="aaaBBBg";
        StringBuilder sb=new StringBuilder(s);
        StringBuilder ans=new StringBuilder();
        int count=1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                ans.append(s.charAt(i - 1)).append(count);
                count = 1; // Reset count for new character
            }
        }
        // Append the last character group
        ans.append(s.charAt(s.length() - 1)).append(count);
        System.out.println(ans.toString());
    }
}
