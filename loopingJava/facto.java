
// Print the factorial of a given number. 
import java.util.*;;

public class facto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.print("Enter factorial number you want = ");
        int k = sc.nextInt();

        factorial(k);
    }

    public static void factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;

        }
        System.err.println(fact);
    }
}
