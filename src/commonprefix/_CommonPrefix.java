package commonprefix;

import java.sql.Array;
import java.util.Arrays;

public class _CommonPrefix {

    public static void main(String[] args) {
            String [] strs = {"dog","racecar","car"};


        System.out.println(
            longestCommonPrefix(strs));
    }

    static String common(String s1 , String s2){
        int size = Math.min(s1.length() , s2.length());
        StringBuilder sb = new StringBuilder();
        for (int i =0; i < size; i++){
            if (s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            } else break;
        }
        return sb.toString();
    }
    static String longestCommonPrefix(String[] strs) {
        String str2= strs[0];
        for (int i =1; i < strs.length; i++){
            str2 = common(str2 , strs[i]);
        }
        return str2;
    }
}
