package questions;

import java.util.*;

/*
Given an array containing n distinct numbers
taken from 0, 1, 2, ..., n, find the one that
is missing from the array.
*/
public class FindMissingNum {
    public static int sortedFindMissingNum(int[] arr) {
        Arrays.sort(arr);

        int missingVal = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            missingVal = arr[i] + 1;

            if (arr[i + 1] != missingVal)
                return missingVal;
        }

        return missingVal;
    }

    public static int unsortedFindMissingNum(int[] arr) {
        int actualSize = arr.length + 1;
        int sumOfArr = (actualSize + (actualSize - 1)) / 2;
        int sum = 0;

        for (int i = 0; i < arr.length - 1; i++)
            sum += arr[i];

        int missingVal = sumOfArr - sum;

        return missingVal;
    }

    public static void main(String args[]) {
        int[] arr = new int[] { 3, 0, 2 };

        System.out.println("Unsorted: " + unsortedFindMissingNum(arr));
        System.out.println("Sorted: " + sortedFindMissingNum(arr));
    }
}