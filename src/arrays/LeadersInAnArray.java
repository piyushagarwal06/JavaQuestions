package arrays;

public class LeadersInAnArray {
    public static void main(String[] args) {
        int []arr={22,15,4,7,9,4,7,8};
        int max=arr[arr.length-1];
        System.out.print(max+" ");

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
}
