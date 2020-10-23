package questions;

public class MaxContiguousSubarray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int maxEndingHere = nums[0];

        for (int i = 1; i < nums.length; i++) {
            maxEndingHere = Math.max(maxEndingHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        return maxSoFar;
    }

    public static void main(String args[]) {
        int arr[] = new int[] { 3, -1, 2, -5, 4, 6 };
        System.out.println(maxSubArray(arr));
    }
}

/*
 * This solution confused me at first because one thing was getting me confused,
 * and this thing had nothing to do with the problem. The issue was that I was
 * too concerned with the contiguous subarray that I couldn't see this solution
 * and where it was coming from. But after I forgot about that, and just focused
 * on trying to get the maximum sum, it made sense. That may confuse you even
 * more but for me that's what it was lol.
 */