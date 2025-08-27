package arrays;
//insert an element maintaining the other elements also
public class InsertAnElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int element=99;
        int index=3;
        int grr[]=new int[arr.length+1];

        for(int i=0;i<index;i++){
            grr[i]=arr[i];
        }
        grr[index]=element;

        for(int i=index;i<arr.length;i++){
            grr[i+1]=arr[i];
        }

        for(int n:grr){
            System.out.println(n);
        }
    }
}
