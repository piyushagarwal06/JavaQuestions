package arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[]={23,2,25,26,21,11};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int s:arr){
            System.out.print(s+" ");
        }
    }
}
