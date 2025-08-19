package arrays;

public class AverageOfArrayElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int sum=0;
        for(int s:arr){
            sum+=s;
        }
        int average=sum/arr.length;
        System.out.println(average);
    }
}
