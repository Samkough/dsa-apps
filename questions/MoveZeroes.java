package questions;

import java.util.Arrays;

/*
Given an array, write a function
to move all 0's to the end of it
while maintaining the relative order
of the non-zero elements.

Notes:
- You must do this in-place without making a copy of the array.
- Minimize the total number of operations.
*/
public class MoveZeroes {
    // O(n^2)
    public static void bfMoveZeroes(int nums[]) {
        int zeroCount = 0;

        // count all zeroes
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        // move non-zero numbers up and move zeroes to the end
        for (int i = 0; i < nums.length; i++) {
            if (i >= nums.length - zeroCount) {
                nums[i] = 0;
            } else {
                if (nums[i] == 0) {
                    for (int j = i + 1; j < nums.length; j++) {
                        if (nums[j] != 0) {
                            nums[i] = nums[j];
                            nums[j] = 0;
                            break;
                        }
                    }
                }
            }
        }
    }

    // O(n)
    public static void eMoveZeroes(int[] nums) {
        int zeroCount = 0;

        // count all zeroes
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroCount++;
            }
        }

        // insert all non-zero numbers in front
        int insertPosition = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }

        // move zeroes to back
        for (int i = 0; i < nums.length; i++) {
            if (i >= nums.length - zeroCount) {
                nums[i] = 0;
            }
        }
    }

    // O(n)
    public static void esMoveZeroes(int[] nums) {
        int nonZeroIndex = 0;

        // move all non-zero numbers to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        // move all zeroes to the back
        for (int i = nums.length - 1; i > nonZeroIndex - 1; i--) {
            nums[i] = 0;
        }
    }

    public static void main(String args[]) {
        int arr1[] = new int[] { 0, 1, 0, 3, 12 };
        System.out.print(Arrays.toString(arr1) + ": ");
        bfMoveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));

        int arr2[] = new int[] { 0, 0, 0, 4, 0, 3, 3, 0, 0, 3, 12, 0 };
        System.out.print(Arrays.toString(arr2) + ": ");
        eMoveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));

        int arr3[] = new int[] { 0, 0, 4, 0, 3, 0, 0, 3, 12, 0 };
        System.out.print(Arrays.toString(arr3) + ": ");
        esMoveZeroes(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}