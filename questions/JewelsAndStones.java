import java.util.HashSet;
import java.util.Set;

/*
The letters in J are guaranteed distinct,
and all characters in J and S are letters.
Letters are case sensitive, so "a" is considered
a different type of stone from "A".
*/
public class JewelsAndStones {
    // O(n^2)
    public static int bfNumStonesAreJewels (String J, String S) {
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

    // O(n)
    public static int eNumStonesAreJewels (String J, String S) {
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

    public static void main (String args[]) {
        String j1 = "ab";
        String s1 = "aAAbbbb";
        System.out.println("Jewels: " + j1 + "\nStones: " + s1 + "\nNumber of Stones that are Jewels: " + bfNumStonesAreJewels(j1, s1));

        String j2 = "aksmlZ";
        String s2 = "ksakAKssaAzxcq";
        System.out.println("Jewels: " + j2 + "\nStones: " + s2 + "\nNumber of Stones that are Jewels: " + eNumStonesAreJewels(j2, s2));
    }
}