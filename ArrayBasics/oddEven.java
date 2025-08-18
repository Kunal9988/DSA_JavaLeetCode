// Count the number of even and odd elements in an array
// Input: {2, 5, 6, 9, 11} → Output: Even = 2, Odd = 3

public class oddEven {
    public static void main(String[] args) {
        int[] arr = { 2, 5, 6, 9, 11 };
        oddEvenFun(arr);
    }

    public static void oddEvenFun(int[] arr) {
        int odd = 0;
        int Even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                Even = arr[i];
            } else {
                odd = arr[i];
            }
        }
        System.out.println("Even is from array " + Even);
        System.out.println("Odd is from array " + odd);
    }
}
