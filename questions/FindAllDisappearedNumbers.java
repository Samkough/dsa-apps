package questions;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
Given an array of integers where
1 ≤ a[i] ≤ n (n = size of array),
some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive
that do not appear in this array.
*/
public class FindAllDisappearedNumbers {
    // O(n) time, O(n) space
    public static List<Integer> efFindAllMissingNums(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!map.containsKey(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String args[]) {
        int[] arr = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(Arrays.toString(arr) + ": " + efFindAllMissingNums(arr));
    }
}