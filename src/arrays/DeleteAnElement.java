package arrays;

public class DeleteAnElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int index=2;
        int ans[]=new int[arr.length-1];

        for(int i=0;i<index;i++){
            ans[i]=arr[i];
        }
        for(int i=index+1;i<arr.length;i++){
            ans[i-1]=arr[i];
        }

        for(int n:ans){
            System.out.println(n);
        }
    }
}
