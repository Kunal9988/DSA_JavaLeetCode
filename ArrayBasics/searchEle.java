// Search for an element in an array (Linear Search)
// Input: {10, 20, 30, 40}, key = 30 → Output: Found at index 2

public class searchEle {
    public static void main(String[] args) {
        int[] arr = { 10, 20, 30, 40 };
        int key = 30;
        SearchEleFunc(arr, key);

    }

    public static void SearchEleFunc(int[] arr, int key) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.err.println("Found at index " + i);
            }
        }
    }
}
