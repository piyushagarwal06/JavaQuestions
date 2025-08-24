package arrays;

public class ShiftZerosAtEnd {
    public static void main(String[] args) {
        int arr[]={1,5,1,0,0,0,0,0,1,1,1,1,1,0};
//        for(int i=0;i<arr.length;i++){
//            for(int j=arr.length-1;j>i;j--){
//                 if(arr[i]==0 && arr[j]==1){
//                    int temp=arr[i];
//                    arr[i]=arr[j];
//                    arr[j]=temp;
//                    break;
//                }
//            }
//        }
        int nonZeroIndex = 0;

        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex++] = arr[i];
            }
        }

        // Fill the rest of the array with zeros
        while (nonZeroIndex < arr.length) {
            arr[nonZeroIndex++] = 0;
        }


        for(int n:arr){
            System.out.print(n+" ");
        }
    }
}
