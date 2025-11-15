package Hashing;

import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s="race";
        String t="care";

        if(s.length() != t.length()) {
            System.out.println("NO");
            return;
        }

        HashMap<Character,Integer> mp=new HashMap<>();

        for(char i:s.toCharArray()){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }

        for(char c:t.toCharArray()){
            if(!mp.containsKey(c)){
                System.out.println("NO");
                return;
            }
            mp.put(c,mp.get(c)-1);
            if(mp.get(c)==0){
                mp.remove(c);
            }
        }

        if(mp.isEmpty()){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
