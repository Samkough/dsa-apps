package questions;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:
- Initially target array is empty.
- From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
- Repeat the previous step until there are no elements to read in nums and index.
- Return the target array.

It is guaranteed that the insertion operations will be valid.
*/
public class TargetArrayInGivenOrder {
    // O(n)
    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        int[] target = new int[nums.length];

        for (int i = 0; i < index.length; i++) {
            list.add(index[i], nums[i]);
        }

        for (int i = 0; i < target.length; i++) {
            target[i] = list.get(i);
        }

        return target;
    }

    public static void main(String args[]) {
        int nums[] = new int[] { 0, 1, 2, 3, 4 };
        int index[] = new int[] { 0, 1, 2, 2, 1 };
        System.out.println("The target array is: " + Arrays.toString(createTargetArray(nums, index)));

        nums = new int[] { 1, 2, 3, 4, 0 };
        index = new int[] { 0, 1, 2, 3, 0 };
        System.out.println("The target array is: " + Arrays.toString(createTargetArray(nums, index)));
    }
}