package Strings;

public class ToggleCaseConversion {
    public static void main(String[] args) {
        String s="Aa";
        char []a=s.toCharArray();
        for(int i=0;i<a.length;i++){
            if(a[i]>=65 && a[i]<=90){
                a[i]= (char) (a[i]+32);
            }
            else if (a[i] >= 97 && a[i] <= 122) {
                // If the character is lowercase, convert it to uppercase
                a[i] = (char) (a[i] - 32);
            }
        }
        //a.toString();
//        for (char d:a){
//            System.out.println(d);
//        }
        System.out.println(a);
        //Because System.out.println(char[]) is a special case in Java
        // — it automatically treats a char[] as a string of characters and prints it as such.
        //System.out.println(a);
        //Where a is a char[], Java picks the overloaded println(char[] x) method, which prints the array as a string — not as an object reference, and not as ASCII values.
    }
}
