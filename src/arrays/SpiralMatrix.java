package arrays;

import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int[][] arr = new int[m][n];
        for(int i=0;i<m;i++){
            for (int j = 0; j <n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }

        for (int[] g : arr) {
            for (int s : g) {
                System.out.print(s + " ");
            }
            System.out.println();
        }


        int top=0,bottom=m-1;
        int left=0,right=n-1;

        int totalElements=0;
        while(totalElements<m*n) {

            //top row-->left col to right col
            for (int j =left; j <=right && totalElements<m*n; j++) {
                System.out.print(arr[top][j]+" ");
                totalElements++;
            }
            top++;

            //right col--> top to bottom row
            for(int i=top;i<=bottom && totalElements<m*n;i++){
                System.out.print(arr[i][right]+" ");
                totalElements++;

            }
            right--;

            //bottom row--> right to left col
            for(int j=right;j>=left && totalElements<m*n;j--){
                System.out.print(arr[bottom][j]+" ");
                totalElements++;
            }
            bottom--;

            //left col-->bottom to top row
            for (int i =bottom; i>=top && totalElements<m*n;i--) {
                System.out.print(arr[i][left]+" ");
                totalElements++;
            }
            left++;
        }
    }
}
