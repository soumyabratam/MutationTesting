package org.vodqa;

public class MaxCalculator {

    public static int findMax(int arr[]) {
        if (arr.length > 0) {

            int max = arr[0];
            for (int i = 1; i < arr.length; i++) {
                if (max < arr[i])
                    max = arr[i];
            }
            return max;
        }
        return 0;
    }
}
