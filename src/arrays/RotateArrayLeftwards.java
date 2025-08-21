package arrays;

public class RotateArrayLeftwards {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
        int first=arr[0];
        for(int i=0;i<arr.length-1;i++){
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=first;
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
