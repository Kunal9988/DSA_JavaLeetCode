// Count how many numbers between 1 and 100 are divisible by 3.

public class devide {
    public static void main(String[] args) {
        divisibleByThree(100);
    }

    public static void divisibleByThree(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.err.println(i);
            }
        }
    }
}
