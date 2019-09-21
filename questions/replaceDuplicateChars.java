/*
array of characters
write a function where all the duplicate characters have
been replaced with x
--------
input = [a, b, b, a, c, a]
output = [a, b, x, x, c, x]
*/

import java.util.*;

public class replaceDuplicateChars {
    public static char[] replaceDuplicateChars(char[] arr) {
        List<Character> newArr = new ArrayList<Character>();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i = 0; i < arr.length; i++) {
            if(map.get(arr[i]) == null)
                map.put(arr[i], i);
            else
                newArr.add('x');
            newArr.add(arr[i]);
        }
    }

    public static void main (String args[]) {
        char[] chars = new char[]{'a', 'b', 'b', 'a', 'c', 'a'};

        System.out.println(replaceDuplicateChars(chars));
    }
}