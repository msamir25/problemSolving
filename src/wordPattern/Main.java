package wordPattern;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat fish";
        System.out.println(wordPattern(pattern, s));

    }

    static boolean wordPattern(String pattern, String s) {
        char[] c = pattern.toCharArray();
        String[] s2 = s.split(" ");
        Map<Character, String> ptnMap = new HashMap<>();

        if (pattern.length() != s.length()){
            return false;
        }
        for (int i = 0; i < c.length; i++) {
            if (ptnMap.containsKey(c[i])) {
                if (!(ptnMap.get(c[i]).equals(s2[i]))) {
                    return false;
                }
            } else if (!ptnMap.containsValue(s2[i])) {
                ptnMap.put(c[i], s2[i]);
            } else {
                return false;
            }
        }
        return true;
    }
}
