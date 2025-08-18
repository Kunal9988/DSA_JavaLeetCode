// Print the multiplication table of a given number (e.g., 5).

import java.util.Scanner;

public class mul {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.err.print("enter the value = ");
        int n = sc.nextInt();

        mul_table(n);
    }

    public static void mul_table(int n) {
        for (int i = 1; i <= 10; i++) {
            System.err.println(n + " " + "X" + " " + i + " " + "=" + " " + n * i);
        }
    }
}
