package Strings;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public static void main(String[] args) {
        String sentence = "This is a test. This test is only a test.";

        sentence=sentence.toLowerCase().replaceAll("[^a-z\\s]","");
        String []words=sentence.split("\\s");
        HashMap<String,Integer>mp=new HashMap<>();
        for(String word:words){
            if(word.isEmpty())continue;
            mp.put(word,mp.getOrDefault(word,0)+1);
        }
        for(Map.Entry<String,Integer>entry :mp.entrySet()){
            System.out.println(entry.getKey()+" : "+ entry.getValue());

        }
    }
}
