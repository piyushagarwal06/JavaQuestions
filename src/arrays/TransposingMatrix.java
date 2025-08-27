package arrays;

import java.util.Scanner;
//Non square-matrix needs to be transposed using another array
//For square matrix,transposing can be done in-place
public class TransposingMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int[] n : arr) {
            for (int s : n) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[i].length;j++){
//                arr[i][j]=arr[j][i];
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for (int[] n : arr) {
            for (int s : n) {
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
