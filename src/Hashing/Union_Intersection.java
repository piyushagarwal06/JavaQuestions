package Hashing;

import java.util.HashSet;

public class Union_Intersection {
    public static void main(String[] args) {
        int []arr={7,3,9};
        int []grr={6,3,9,2,9,4};

        //UNION of two arrays
        HashSet<Integer>hs=new HashSet<>();
        for (int j : arr) {
            hs.add(j);
        }
        for (int j : grr) {
            hs.add(j);
        }
        System.out.println(hs);


        //INTERSECTION of two arrays
        HashSet<Integer> s = new HashSet<>();
        for(int i : arr) s.add(i);

        HashSet<Integer> gr = new HashSet<>();
        for(int i : grr) gr.add(i);

        s.retainAll(gr);  // Keeps only elements present in both sets
        System.out.println(s);

       // Alternate approach - store common elements in another array
    }
}
