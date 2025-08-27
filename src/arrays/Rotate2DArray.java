package arrays;

import java.util.Scanner;

public class Rotate2DArray {
    static void print(int[][]arr){
        for (int[] n : arr) {
            for (int s : n) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        TransposingMatrix.print(arr);
        System.out.println();

        //transposing matrix
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
//                arr[i][j]=arr[j][i];
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        TransposingMatrix.print(arr);
        System.out.println();

        //rotating matrix
        for(int i=0;i<arr.length;i++){
            int left=0,right= arr.length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }
        TransposingMatrix.print(arr);
    }
}
