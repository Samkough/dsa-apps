import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

/*
Given an array of size n, find the majority element.
The majority element is the element that appears more than ⌊ n/2 ⌋ times.
*/
public class MajorityElement {
    // O(n) time, O(n) space
    public static int eMajorityElement (int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        // add elements to hashmap
        for (int i = 0; i < nums.length; i++) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }

        // iterate through map and see which element is seen more than n/2 times
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() > nums.length / 2) {
                return e.getKey();
            }
        }

        return 0;
    }

    public static void main (String args[]) {
        int arr[] = new int[]{2, 4, 2, 2, 3, 4, 1, 2, 3, 2, 2};
        System.out.println("Majority element for " + Arrays.toString(arr) + " is " + eMajorityElement(arr) + ".");
    }
}