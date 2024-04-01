package IsomorphicString;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String s ,String t){
        Map<Character , Character>charMap = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if (charMap.containsKey(s.charAt(i))){
                if (charMap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else if (!charMap.containsValue(t.charAt(i))){
                charMap.put(s.charAt(i) , t.charAt(i));
            }else {
                return false;
            }
        }
        return true;
    }
}
