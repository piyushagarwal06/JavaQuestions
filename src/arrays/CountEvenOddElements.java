package arrays;

public class CountEvenOddElements {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int countE=0,countO=0;
        for(int s:arr){
            if(s%2==0){
                countE++;
            }
            else countO++;
        }
        System.out.println("Number of even numbers are "+ countE);
        System.out.println("Number of odd numbers are "+ countO);
    }
}
