package questions;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class FindEmbeddedWord {
    public static String findEmbeddedWord(String[] words, String embeddedWord) {
        Map<String, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            List<Integer> list = new ArrayList<>();
            map.put(words[i], list);
        }

        for (int i = 0; i < embeddedWord.length(); i++) {
            for (int j = 0; j < words.length; j++) {
                int wordLength = words[j].length();
                for (int k = 0; k < words[j].length(); k++) {
                    List<Integer> list = map.get(words[j]);

                    if (list.contains(k)) {
                        break;
                    }
                    list.add(k);
                    map.put(words[j], list);

                    if (list.size() == wordLength) {
                        return words[j];
                    }

                    break;
                }
            }
        }

        return "None";
    }

    public static void main(String args[]) {
        String words[] = new String[] { "cat", "baby", "dog", "bird", "car", "ax" };
        String str1 = "tcabnihjs";
        System.out.println(findEmbeddedWord(words, str1));

        String str2 = "tbcanihjs";
        System.out.println(findEmbeddedWord(words, str2));

        String str3 = "baykkjl";
        System.out.println(findEmbeddedWord(words, str3));

        String str4 = "bbabylkkj";
        System.out.println(findEmbeddedWord(words, str4));

        String str5 = "ccc";
        System.out.println(findEmbeddedWord(words, str5));

        String str6 = "nbird";
        System.out.println(findEmbeddedWord(words, str6));
    }
}
