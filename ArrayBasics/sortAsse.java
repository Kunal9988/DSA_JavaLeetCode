// Sort an array in ascending order without using java func
// Input: {5, 2, 9, 1, 6} → Output: {1, 2, 5, 6, 9} 

import java.util.*;

public class sortAsse {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 6 };
        SrtAssc(arr);
    }

    public static void SrtAssc(int[] arr) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.err.println(arr[i]);
        }
    }
}