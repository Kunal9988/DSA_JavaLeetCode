// Calculate the average of array elements
// Input: {10, 20, 30, 40, 50} → Output: 30

public class avgEle {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40, 50 };
        averager(arr);

        int[] arr2 = { 17, 42, 8, 29, 63, 5, 91, 34, 56, 12 };
        averager(arr2);

    }

    public static void averager(int[] arr) {
        int avg = 0;
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            sum = sum + arr[i];
            avg = sum / n;

        }
        System.err.println("Averge of element of array = " + sum + " / " + n + " = " + avg);

    }
}
