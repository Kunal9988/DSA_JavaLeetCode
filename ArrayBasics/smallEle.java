// Find the smallest element in an array
// Input: {5, 2, 8, 1, 9} → Output: 1

public class smallEle {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 8, 1, 9 };
        minVal(arr);
        int[] arr2 = { 1, 2, 2, 16, 9 };
        minVal(arr2);

    }

    public static void minVal(int[] arr) {
        int n = arr.length;
        int min = arr[0];

        for (int i = 0; i < n; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.err.println(min);
    }
}
