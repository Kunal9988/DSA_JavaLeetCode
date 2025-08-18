
// Reverse the digits of a number (e.g., 123 → 321). 
import java.util.*;

public class reverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter Number = ");
        int num = sc.nextInt();

        int reverseNum = Reverse(num);
        System.err.println(reverseNum);

    }

    public static int Reverse(int n) {
        int rev_num = 0;
        while (n != 0) {
            int digits = n % 10;
            rev_num = rev_num * 10 + digits;
            n = n / 10;
        }
        return rev_num;
    }
}
