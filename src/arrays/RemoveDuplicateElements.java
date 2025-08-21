package arrays;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        int arr[]={11,11,22,22,33,44,33};

        int k=0;// Tracks position of next unique element

        for (int i = 0; i < arr.length; i++) {
            boolean flag=false;
            for(int j=0;j<k;j++){
                if(arr[i]==arr[j]){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                arr[k]=arr[i];
                k++;
            }
        }
        // Print only the unique elements
        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
