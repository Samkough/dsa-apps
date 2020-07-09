/*
Balanced strings are those who have equal quantity of 'L' and 'R' characters.

Given a balanced string s split it in the maximum amount of balanced strings.

Return the maximum amount of splitted balanced strings.
*/
public class BalancedRLString {
    // O(n)
    public static int balancedStringSplit(String s) {
        int count = 0;
        int balancedCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                balancedCount++;
            }
        }

        return balancedCount;
    }

    public static void main(String args[]) {
        String s = "RLRRLLRLRL";
        System.out.printf("There are %s balanced strings in %s.%n", balancedStringSplit(s), s);

        s = "RLLLLRRRLR";
        System.out.printf("There are %s balanced strings in %s.%n", balancedStringSplit(s), s);

        s = "LLLLRRRR";
        System.out.printf("There are %s balanced strings in %s.%n", balancedStringSplit(s), s);

        s = "RLRRRLLRLL";
        System.out.printf("There are %s balanced strings in %s.%n", balancedStringSplit(s), s);
    }
}

/*
 * When I first tried to solve this, I for some reason thought using a Stack
 * immediately would be the best way to go about it.
 * 
 * As I was using a Stack to solve it though, I found out that I was
 * overthinking it and didn't really need this. If I'm able to keep count of the
 * right and left, it should be fine, right?
 * 
 * And so I pivoted and pretty much right away solved it. Doesn't always need a
 * certain data structure.
 */