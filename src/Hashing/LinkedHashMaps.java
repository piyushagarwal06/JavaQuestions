package Hashing;

import java.util.LinkedHashMap;
//LinkedHashMap is a hash map that maintains the insertion order of the elements, unlike a regular HashMap which does not guarantee any order.
//LinkedHashMap maintains insertion order because internally it uses a doubly linked list along with a hash table.
public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India" , 100);
        lhm.put("China",150);
        lhm.put("US",50);
        System.out.println(lhm);
    }
}
