import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/*
Given a non-empty array of integers,
every element appears twice except for one.
Find that single one.
*/
public class SingleNumber {
    // O(n)
    public static int eSingleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 0);
            }
            map.put(nums[i], map.get(nums[i]) + 1);
        }
        
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if(e.getValue() == 1) {
                return e.getKey();
            }
        }
        
        return 0;
    }

    public static void main (String args[]) {
        int[] list = new int[]{1, 4, 7, 3, 4, 1, 7};
        System.out.println(Arrays.toString(list) + ": " + eSingleNumber(list));
    }
}