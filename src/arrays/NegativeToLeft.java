package arrays;
import java.util.Arrays;
public class NegativeToLeft {
    static void Implement(int []arr){
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]>=0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left ++;
                right--;
            }
            else if(arr[left]<0) left++;
            else if(arr[right]>=0) right--;
        }
    }
    public static void main(String[] args) {
        int[][] testCases = {
                {3, -2, -5, 7, 0, -1, 4},
                {-1, -2, -3, -4},
                {1, 2, 3, 4},
                {},
                {0, -1, 1, -2, 2},
                {-5},
                {5},
                {-1, 2, -3, 4, -5, 6},
                {-1, 0, 1, -2, 2, -3, 3}
        };
        for(int i=0;i<testCases.length;i++){
            int[] test = Arrays.copyOf(testCases[i], testCases[i].length);//It creates a copy of the i-th test case array so that any modifications made to test do not affect the original testCases[i].
            System.out.println("Test Case " + (i + 1));
            System.out.println("Original:   " + Arrays.toString(test));
            Implement(test);
            System.out.println("Rearranged: " + Arrays.toString(test));
            System.out.println("---------------------------");
        }
    }
}
