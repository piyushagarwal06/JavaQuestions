package Hashing;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSets {
    public static void main(String[] args) {
       TreeSet<String> cities=new TreeSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Noida");
        cities.add("Bengaluru");
        System.out.println(cities);//will print in sorted ascending order
    }
}
