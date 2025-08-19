package arrays;

public class StoreElementsInReverseOrderInplace {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,100,67};
        for(int s:arr){
            System.out.print(s+" ");
        }
        System.out.println();
        int n=arr.length;
        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
//            arr[i]=arr[n-1];
//            n--;
        }
        for(int s:arr){
            System.out.print(s+" ");
        }
    }
}
