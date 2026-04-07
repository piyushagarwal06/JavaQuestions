package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class slidingWindowNegativeInteger {

    static int[] sw(int []arr,int k){
        int []res=new int[arr.length-k+1];
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i< arr.length;i++){ // adding indices of -ve values
            if(arr[i]<0){
                q.add(i);
            }
        }
        for(int i=0;i< arr.length-k+1;i++){
            if(q.size()>0 && q.peek()<i) q.remove();

            if(q.size()> 0 ){
                res[i]=arr[q.peek()];
            }
            else if(q.size()==0) res[i]=0;
            else res[i]=0;
        }
        return res;
    }

    public static void main(String[] args) {
        int k=3;
        int arr[]={12,-1,-7,8,-15,30,16,28};
        int []grr=sw(arr,k);
        for (int j : grr) {
            System.out.println(j);
        }
    }
}
