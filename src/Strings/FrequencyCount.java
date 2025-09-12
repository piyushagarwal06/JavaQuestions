package Strings;

public class FrequencyCount {
    public static void main(String[] args) {
        String s="Whatsapp";
        char arr[]=s.toCharArray();
        int freq[]=new int[26];
        for(int i=0;i<s.length();i++){
            if (arr[i] >= 'a' && arr[i] <= 'z')
                freq[arr[i]-'a']++;
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] > 0) {
                System.out.println((char)(i + 'a') + " : " + freq[i]);
            }
        }
    }
}
