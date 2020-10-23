package questions;

import java.util.Set;
import java.util.HashSet;

/*
Given an array of integers, find
if the array contains any duplicates.

Your function should return true
if any value appears at least twice
in the array, and it should return
false if every element is distinct.
*/
public class ContainsDuplicate {
    // O(n^2)
    public static boolean bfContainsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = 0; j < i; ++j) {
                if (nums[j] == nums[i])
                    return true;
            }
        }
        return false;
    }

    // O(n)
    public static boolean eContainsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        int[] nums1 = new int[] { 1, 2, 3, 4, 4 };
        int[] nums2 = new int[] { 1, 2, 3, 4, 5 };

        System.out.println(bfContainsDuplicate(nums1)); // true
        System.out.println(eContainsDuplicate(nums2)); // false
    }
}