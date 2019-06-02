import java.util.Map;
import java.util.HashMap;

public class MyClass {
    public static String isUnique(String s){
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
        System.out.println(isUnique(s));
        
        String d = "helo";
        System.out.println(isUnique(d));
    }
}