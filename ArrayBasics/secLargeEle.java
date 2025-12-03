// Find the second largest element in an array
// Input: {10, 25, 8, 36, 20} → Output: 25

import java.util.Arrays;

public class secLargeEle {
    public static void main(String[] args) {
        int[] arr = { 10, 25, 8, 36, 20 };
        System.out.println(SecLarge(arr));

    }

    public static int SecLarge(int[] arr) {
        int n = arr.length;
        Arrays.sort(arr);

        for (int i = n - 2; i >= 0; i--) {

            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }

        }
        return -1;

    }
}
