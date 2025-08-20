package arrays;
public class arrayStringSort {
    public static void main(String[] args) {
        String arr[]={"zebra","Yak","ullu","monkey"};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j].compareToIgnoreCase(arr[j+1])>0){//ignoring the U/L cases
                    String temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(String S:arr){
            System.out.print(S+" ");
        }
    }
}
