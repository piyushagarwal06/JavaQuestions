package greedy;

import java.util.Arrays;
import java.util.Comparator;
//Write a Java program to find the maximum length of a chain that can be formed from the given pairs.
//You may reorder the pairs in any way.

//SOLUTION-You are given a list of n pairs of integers. Each pair [a, b] represents an interval such that a < b.
//A pair [c, d] can follow [a, b] in a chain if b < c.
// That is, the second pair can be chained after the first if its start is greater than the end of the previous.
public class MaxLengthOfChainPairs {
    public static void main(String[] args) {
        int pairs[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        Arrays.sort(pairs, Comparator.comparingDouble((o->o[1])));

        int chainLen=1;
        int chainEnd=pairs[0][1];//last selected pair end

        for (int i = 1; i < pairs.length ; i++) {
            if(pairs[i][0]>chainEnd){
                chainLen++;
                chainEnd=pairs[i][1];
            }
        }
        System.out.println(chainLen);
    }
}
