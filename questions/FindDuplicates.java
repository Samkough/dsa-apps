import java.util.*;

/*
Given an array of integers,
1 ≤ a[i] ≤ n (n = size of array),
some elements appear twice and
others appear once.

Find all the elements that appear
twice in this array.
*/
public class FindDuplicates {
    public static List<Integer> returnDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Set<Integer> numSet = new HashSet<>();

        for (Integer num : nums) {
            if(!numSet.add(num))
                duplicates.add(num);
        }

        return duplicates;
    }

    public static void main (String[] args) {
        int[] arr1 = new int[]{2, 3, 1, 7, 8};
        System.out.println(returnDuplicates(arr1));

        int[] arr2 = new int[]{2, 3, 1, 2, 8};
        System.out.println(returnDuplicates(arr2));

        int[] arr3 = new int[]{2, 3, 1, 2, 8, 1, 8};
        System.out.println(returnDuplicates(arr3));
    }
}