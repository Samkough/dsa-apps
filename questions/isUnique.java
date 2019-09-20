import java.util.Map;
import java.util.HashMap;

public class isUnique {
    public static String isStringUnique(String s){
        Map<Character, Integer> map = new HashMap();
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        for(Character c : map.keySet()){
            if(map.get(c) > 1)
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