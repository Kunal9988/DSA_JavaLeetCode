// Print the squares of numbers from 1 to 10.    

public class squaresNo {

    public static void main(String args[]) {
        squaresOfNo(10);
    }

    public static void squaresOfNo(int n) {
        int square = 0;
        for (int i = 1; i <= n; i++) {
            square = i * i;
            System.err.println("Square of " + " " + i + " = " + square);
        }

    }

}
