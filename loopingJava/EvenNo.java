
// Print all even numbers from 1 to 50.

public class EvenNo {
    public static void main(String args[]) {
        evenNo(50);
    }

    public static void evenNo(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.err.println(i);
            }

        }
    }
}
