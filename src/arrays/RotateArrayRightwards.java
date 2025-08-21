package arrays;

public class RotateArrayRightwards {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        for(int n:arr){
            System.out.print(n+" ");
        }
        System.out.println();
        int last=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=last;
        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
