package arrays;
import java.util.Arrays;
public class AscendingCheck {
    public static void main(String[] args) {
        int arr[]={2,1,4,5,23,22};
        //Arrays.sort(arr);
        boolean flag=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                flag=false;
                break;
            }
        }
        System.out.println(flag?true:false);
    }
}
