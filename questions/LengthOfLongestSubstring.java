import java.util.Set;
import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static int bfLengthOfLongestSubstring(String s) {
        int ans = 0;
        boolean didBreak = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                Set<Character> set = new HashSet<>();
                for (int k = i; k < j; k++) {
                    Character ch = s.charAt(k);
                    if (set.contains(ch)) {
                        didBreak = true;
                        break;
                    }
                    set.add(ch);
                }
                if (!didBreak) {
                    ans = Math.max(ans, set.size());
                } else {
                    didBreak = false;
                }
            }
        }
        return ans;
    }

    public static void main (String args[]) {
        String test1 = "abcabcbb";
        System.out.println(test1 + ": " + bfLengthOfLongestSubstring(test1)); // 3
        String test2 = "bbbbbbb";
        System.out.println(test2 + ": " + bfLengthOfLongestSubstring(test2)); // 1
        String test3 = "pwwkew";
        System.out.println(test3 + ": " + bfLengthOfLongestSubstring(test3)); // 3
        String test4 = "dvdf";
        System.out.println(test4 + ": " + bfLengthOfLongestSubstring(test4)); // 3
        String test5 = "ABDEFGABEF";
        System.out.println(test5 + ": " + bfLengthOfLongestSubstring(test5)); // 6
    }
}