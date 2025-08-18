// Find the sum of numbers from 1 to 100.

import java.util.Scanner;

public class sumNo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter the number = ");
        int n = sc.nextInt();

        int k = SumofNum(n);
        System.out.println(k);
    }

    public static int SumofNum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {

            sum = sum + i;
        }
        return sum;
    }
}
