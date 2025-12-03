// Copy elements of one array into another array
// Input: {1, 2, 3, 4} → Output: {1, 2, 3, 4} (in a new array)

import java.util.Arrays;

public class copyArr {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 4 };

        int[] arr2 = copyArray(arr1); // call function

        System.out.println("Original: " + Arrays.toString(arr1));
        System.out.println("Copy:     " + Arrays.toString(arr2));

    }

    public static int[] copyArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
