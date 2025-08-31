package greedy;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        //the activity end time is given in sorted order
        int []start={1,3,0,5,8,5};//activity start time
        int []end={2,4,6,7,9,9}; //sorted array.if unsorted sort it first

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxAct=1;
        ans.add(0);
        int lastEnd=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastEnd){
                //activity select
                maxAct++;
                lastEnd=end[i];
                ans.add(i);
            }
        }
        System.out.println("max activities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
