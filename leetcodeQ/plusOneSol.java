//66. Plus One from leet code 
// link - https://leetcode.com/problems/plus-one/?envType=problem-list-v2&envId=array

import java.util.Arrays;

public class plusOneSol {

    public static void main(String args[]) {
        int[] digit = { 1, 9 };
        System.out.println(Arrays.toString(plusOne(digit)));
    }

    static int[] plusOne(int[] digits) {

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {

            if (digits[i] < 9) {

                digits[i]++;
                return digits;

            }
            digits[i] = 0;

        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;

    }

}
