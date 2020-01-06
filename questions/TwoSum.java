import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
    public static int[] bfTwoSum (int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] {i, j};
                    }
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

    public static int[] eTwoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution!");
    }

    public static void main (String args[]) {
        int[] arr = new int[]{2, 7, 11, 15};
        int target = 9;
        System.out.println("Brute Force: " + Arrays.toString(bfTwoSum(arr, target)));
        System.out.println("Efficient: " + Arrays.toString(eTwoSum(arr, target)));
    }
}