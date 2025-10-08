package dynamicProgramming;

public class CatalansNumberRecursion {
    public static int catalanRec(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans=0;//Cn
        for(int i=0;i<n;i++){
            ans+=catalanRec(i) * catalanRec(n-1-i);
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(catalanRec(30));
    }
}
