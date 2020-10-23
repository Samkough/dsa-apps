package questions;

import java.util.Map;
import java.util.HashMap;

/*
Given a string, determine if it has all unique characters.
*/
public class IsUnique {
    public static String isStringUnique(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) > 1)
                return s + " is not unique!\n";
        }

        return s + " is unique!\n";
    }

    public static void main(String args[]) {
        String s = "hhello";
        String d = "helo";

        System.out.println(isStringUnique(s));
        System.out.println(isStringUnique(d));
    }
}