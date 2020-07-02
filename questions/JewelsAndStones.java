import java.util.Set;
import java.util.HashSet;
import java.util.Map;
import java.util.HashMap;

/*
The letters in J are guaranteed distinct,
and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered
a different type of stone from "A".
*/
public class JewelsAndStones {
    // O(n^2)
    public static int bfNumStonesAreJewels(String J, String S) {
        int numOfJewels = 0;

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < J.length(); j++) {
                if (S.charAt(i) == J.charAt(j)) {
                    numOfJewels++;
                    break;
                }
            }
        }

        return numOfJewels;
    }

    // O(n) w/ HashSet
    public static int eNumStonesAreJewels(String J, String S) {
        Set<Character> uniqueStones = new HashSet<Character>();

        for (int i = 0; i < J.length(); i++) {
            uniqueStones.add(J.charAt(i));
        }

        int numJewels = 0;
        for (int i = 0; i < S.length(); i++) {
            if (uniqueStones.contains(S.charAt(i))) {
                numJewels++;
            }
        }

        return numJewels;
    }

    // O(n) w/ HashMap
    public int e2numJewelsInStones(String J, String S) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int i = 0; i < J.length(); i++) {
            map.put(J.charAt(i), i);
        }

        int count = 0;
        for (int i = 0; i < S.length(); i++) {
            if (map.containsKey(S.charAt(i))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String args[]) {
        String j1 = "ab";
        String s1 = "aAAbbbb";
        System.out.println("Jewels: " + j1 + "\nStones: " + s1 + "\nNumber of Stones that are Jewels: "
                + bfNumStonesAreJewels(j1, s1));

        String j2 = "aksmlZ";
        String s2 = "ksakAKssaAzxcq";
        System.out.println("Jewels: " + j2 + "\nStones: " + s2 + "\nNumber of Stones that are Jewels: "
                + eNumStonesAreJewels(j2, s2));

        String j3 = "bBzx";
        String s3 = "kjsdownebzBsabxBxxb";
        System.out.println("Jewels: " + j3 + "\nStones: " + s3 + "\nNumber of Stones that are Jewels: "
                + eNumStonesAreJewels(j3, s3));
    }
}