package arrays;

public class PascalsTriangle {
    public static void main(String[] args) {
        int arr[][]=new int[5][];
        for(int i=0;i<arr.length;i++){
            //ith row has i+1 columns
            arr[i]=new int[i+1];

            // 1st and last element of every row is 1
            arr[i][0]=arr[i][i]=1;

            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        System.out.println("Array elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
