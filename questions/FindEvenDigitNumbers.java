package questions;

import java.util.Arrays;

/*
Given an array nums of integers,
return how many of them contain
an even number of digits.
*/
public class FindEvenDigitNumbers {
    // O(n)
    public static int findEvenDigits(int[] nums) {
        int numOfDigits = 0;

        for (int i = 0; i < nums.length; i++) {
            String str = Integer.toString(nums[i]);
            if (str.length() % 2 == 0) {
                numOfDigits++;
            }
        }

        return numOfDigits;
    }

    public static void main(String args[]) {
        int[] nums = new int[] { 2, 55, 4, 23233, 342, 4213 };
        System.out.println(Arrays.toString(nums) + ": " + findEvenDigits(nums));
    }
}