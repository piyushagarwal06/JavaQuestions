package arrays;

public class MaxElement {
    static int maximum(int arr[]){
        int max=-Integer.MIN_VALUE;
        for(int s:arr){
            if(s>max) {
                max = s;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int arr[]={1,23,4,5,87,99};
        int max=MaxElement.maximum(arr);
        System.out.println(max);
    }
}
