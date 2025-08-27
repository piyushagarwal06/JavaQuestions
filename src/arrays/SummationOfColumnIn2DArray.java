package arrays;

import java.util.Scanner;

public class SummationOfColumnIn2DArray {
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

        int ans[] = new int[3];

        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[j][i];
            }
            ans[i]=sum;
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
