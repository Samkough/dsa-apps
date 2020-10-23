package questions;

import java.util.Arrays;

/*
We are given a list nums of integers
representing a list compressed with
run-length encoding.

Consider each adjacent pair of elements
[a, b] = [nums[2*i], nums[2*i+1]] (with i >= 0).
For each such pair, there are a elements
with value b in the decompressed list.

Return the decompressed list.
*/
public class DecompressRunLengthEncodedList {
    // O(n^2)
    public static int[] bfDecompressList(int[] nums) {
        int length = 0;
        for (int i = 0; i < nums.length; i += 2) {
            length += nums[i];
        }

        int[] output = new int[length];
        int temp = 0;
        for (int i = 0; i < nums.length; i += 2) {
            int freq = nums[i];
            int val = nums[i + 1];
            int stop = temp + freq;
            for (int j = temp; j < stop; j++) {
                output[j] = val;
            }
            temp += freq;
        }

        return output;
    }

    public static void main(String args[]) {
        int[] nums1 = new int[] { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(nums1) + ": " + Arrays.toString(bfDecompressList(nums1)));

        int[] nums2 = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(Arrays.toString(nums2) + ": " + Arrays.toString(bfDecompressList(nums2)));

        int[] nums3 = new int[] { 55, 11, 70, 26, 62, 64 };
        System.out.println(Arrays.toString(nums3) + ": " + Arrays.toString(bfDecompressList(nums3)));

        int[] nums4 = new int[] { 1, 4, 1, 4, 1, 4, 1, 4 };
        System.out.println(Arrays.toString(nums4) + ": " + Arrays.toString(bfDecompressList(nums4)));
    }
}