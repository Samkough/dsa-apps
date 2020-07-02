/*
 * Given an integer n and an integer start.
 * Define an array nums where nums[i] = start + 2*i (0-indexed) and n == nums.length.
 * Return the bitwise XOR of all elements of nums.
*/
public class XOROperationInAnArray {
    // Time Complexity: O(n)
    public static int xorOperation(int n, int start) {
        if (n == 1) {
            return start;
        }

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = start + 2 * i;
        }

        int bitwiseXOR = arr[0] ^ arr[1];
        for (int i = 2; i < arr.length; i++) {
            bitwiseXOR = bitwiseXOR ^ arr[i];
        }

        return bitwiseXOR;
    }

    public static void main(String args[]) {
        int n = 5, start = 0;
        System.out.println("When the length of the array is " + n + " and we start at " + start
                + ", the bitwise XOR of all elements of the array is " + xorOperation(n, start));

        n = 4;
        start = 3;
        System.out.println("When the length of the array is " + n + " and we start at " + start
                + ", the bitwise XOR of all elements of the array is " + xorOperation(n, start));

        n = 1;
        start = 7;
        System.out.println("When the length of the array is " + n + " and we start at " + start
                + ", the bitwise XOR of all elements of the array is " + xorOperation(n, start));

        n = 10;
        start = 5;
        System.out.println("When the length of the array is " + n + " and we start at " + start
                + ", the bitwise XOR of all elements of the array is " + xorOperation(n, start));
    }
}

/*
 * Prior to this I never really worked with the XOR operator and this question
 * perplexed me. I put it off for a few days.
 * 
 * I eventually got to it and just read the question slower, looked into
 * anything that I didn't understand, and it became a lot easier. I was just
 * overthinking it because of the term "bitwise" and "XOR". Once I looked into
 * how to use the XOR operator in Java and how the examples got to their
 * solutions, this became a very easy question.
 * 
 * This happens to me a lot where a term or phrase intimidates me, but it's
 * quite candid and simple. Just need to dissect each piece that confuses me and
 * understand it which will then make the whole problem as a whole simple.
 */