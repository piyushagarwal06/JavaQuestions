package arrays;

import java.util.Arrays;

public class SlidingWindowTemperature {
    public static void main(String[] args) {
        int[] temperatures = {30, 32, 35, 33, 36, 38, 40};
        int k = 3;  // 3-day window

        double[] result = movingAverage(temperatures, k);
        System.out.println(Arrays.toString(result));
    }

    public static double[] movingAverage(int[] temps, int k) {
        if (temps.length < k) return new double[0];

        double[] averages = new double[temps.length - k + 1];
        double sum = 0;

        for (int i = 0; i < temps.length; i++) {
            sum += temps[i];  // Add current temperature to window

            if (i >= k) {
                sum -= temps[i - k];  // Remove temp that's now outside window
            }

            if (i >= k - 1) {
                averages[i - k + 1] = Math.round((sum / k) * 100.0) / 100.0;
            }
        }

        return averages;
    }
}
