package questions;

/*
array of characters
write a function where all the duplicate characters have
been replaced with x
--------
input = [a, b, b, a, c, a]
output = [a, b, x, x, c, x]
*/

import java.util.*;

public class ReplaceDuplicateChars {
    public static char[] bfReplaceDuplicateChars(char[] arr) {
        List<Character> newArr = new ArrayList<Character>();
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null)
                map.put(arr[i], i);
            else
                newArr.add('x');
            newArr.add(arr[i]);
        }

        char[] newCharArr = new char[newArr.size()];

        for (int i = 0; i < newArr.size(); i++) {
            newCharArr[i] = newArr.get(i);
        }

        return newCharArr;
    }

    public static void main(String args[]) {
        char[] chars = new char[] { 'a', 'b', 'b', 'a', 'c', 'a' };

        System.out.println(bfReplaceDuplicateChars(chars));
    }
}