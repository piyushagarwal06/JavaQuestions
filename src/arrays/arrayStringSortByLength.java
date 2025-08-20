package arrays;

public class arrayStringSortByLength {
    public static void main(String[] args) {
        String arr[] = {"zebra", "yak", "ullu", "monkey", "go", "a"};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                // Compare based on string length
                if (arr[j].length() > arr[j + 1].length()) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for (String s : arr) {
            System.out.print(s + " ");
        }
    }
}
