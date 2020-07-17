import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;

/*
Given a non-empty array of integers,
every element appears twice except for one.
Find that single one.
*/
public class SingleNumber {
    // time: O(n), space: O(n)
    public static int eSingleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            // HashMap has a method that gives us a default so need for an if
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }

        return 0;
    }

    // time: O(n), space: O(1)
    public static int eeSingleNumber(int[] nums) {
        int num = 0;

        for (int i = 0; i < nums.length; i++) {
            num ^= nums[i];
        }

        return num;
    }

    public static void main(String args[]) {
        int[] list = new int[] { 1, 4, 7, 3, 4, 1, 7 };
        System.out.println(Arrays.toString(list) + ": " + eSingleNumber(list));

        list = new int[] { 2, 5, 8, 4, 5, 2, 8 };
        System.out.println(Arrays.toString(list) + ": " + eeSingleNumber(list));
    }
}

/*
 * Since we know we will only have one number that is duplicated, we could use
 * the XOR operator to let us know about that At first I didn't understand how
 * we could use it but after doing it in binary on pen and paper, I figured it
 * out. Let me display with the numbers we have. So first we set num to 0 which
 * in binary we could show as 0000. So now, here is the rest of the process in
 * binary: 0000 (0) ^ 0010 (4) = 0010 (4) ^ 0101 (5) = 0111 (7) ^ 1000 (8) =
 * 1111 (15) ^ 0100 (4) = 1011 (11) ^ 0101 (5) = 1110 (14) ^ 0010 (2) = 1100
 * (12) ^ 1000 (8) = 0100 (4). So, I know that looks confusing, but let me
 * explain. Essentially how I like to think about it is that for the XOR
 * operator if you use it on the same operator twice, it essentially redos the
 * bits it added. This is how it works because it gives a certain amount of bits
 * but then later down the line takes those bits away by going against the
 * operater again. If you don't understand how binary works and some of it's
 * fundamentals I recommend to look into that and then come back to this. It'll
 * make a lot more sense.
 */