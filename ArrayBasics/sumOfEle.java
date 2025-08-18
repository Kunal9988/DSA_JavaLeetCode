// Calculate the sum of all elements in an array 
// Input:{1,2,3,4,5}→Output:15

public class sumOfEle {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        sum(arr);
    }

    public static void sum(int[] arr) {
        int suma = 0;
        for (int i = 0; i < arr.length; i++) {
            suma = suma + arr[i];
        }
        System.err.println(suma);
    }
}
