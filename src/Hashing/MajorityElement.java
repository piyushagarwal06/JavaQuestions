package Hashing;

import java.util.*;

//Q->Given an integer array of size n.Find all elements that appear more than n/3 times.
public class MajorityElement {
    public static void main(String[] args) {
        //int []nums={1,3,2,5,1,3,1,5,1};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        HashMap<Integer,Integer>mp=new HashMap<>();
        List<Integer> result = new ArrayList<>();
        for(int i:arr){
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:mp.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        System.out.println(result);
    }
}
