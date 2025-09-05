package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ActivitySelectionUnsorted {
    public static void main(String[] args) {
        int []start={1,3,0,5,8,5};//activity start time
        int []end={2,4,6,7,9,9};  //activity end time

        int [][]activities=new int[start.length][3];
        for(int i=0;i< start.length;i++){
            activities[i][0]=i;       //storing original array index
            activities[i][1]=start[i];//storing start time in first column
            activities[i][2]=end[i];  // storing end time in 2nd column
        }

        //lambda function-> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o->o[2]));//This is a lambda function used to sort a 2D array (activities) by the third element (index 2) of each sub-array.

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();

        maxAct=1;
        ans.add(activities[0][0]);
        int lastEnd=activities[0][2];
        for(int i=1;i<end.length;i++){
            if(activities[i][1]>=lastEnd){
                //activity select
                maxAct++;
                lastEnd=activities[i][2];
                ans.add(activities[i][0]);
            }
        }
        System.out.println("max activities="+maxAct);
        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
