
// Find the largest element in an array
// Input: {12, 45, 7, 89, 23} → Output: 89

public class largestElearr {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        largeEle(arr);

        // largeEle(arr);

    }

    public static void largeEle(int[] arr) {
        int n = arr.length;
        int max = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.err.println(max);
    }
}