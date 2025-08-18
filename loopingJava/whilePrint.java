// Print numbers from 10 down to 1 using a while loop.

public class whilePrint {
    public static void main(String args[]) {
        printDownsiteNo(10);
    }

    public static void printDownsiteNo(int n) {
        int i = n;
        while (i > 0) {
            System.out.println(i);
            i--;
        }

    }
}
