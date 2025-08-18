import java.util.Arrays;

public class reverseArr {
    public static void main(String[] args) {
        int[] array1 = { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(reverseArray(array1)));
    }

    public static int[] reverseArray(int[] arr) {
        int r = arr.length - 1;
        int i = 0;
        while (i < r) {

            int temp = arr[i];
            arr[i] = arr[r];
            arr[r] = temp;

            i++;
            r--;
        }
        return arr;

    }
}
