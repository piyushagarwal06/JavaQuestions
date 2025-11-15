package Hashing;
//TreeMap uses Red-Black Tree (self-balancing BST)
//Time complexity for get(), put(), remove() = O(log n)
//Maintains sorted order of keys
//Best for ordered operations (like finding next greater key)

import java.util.*;

public class TreeeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> lhm = new TreeMap<>();
        lhm.put("India" , 100);
        lhm.put("China",150);
        lhm.put("US",50);
        System.out.println(lhm);
    }
}
