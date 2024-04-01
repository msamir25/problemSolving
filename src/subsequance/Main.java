package subsequance;

public class Main {
    public static void main(String[] args) {
        String s = "abc" , t = "ahbgdc";
        System.out.println(isSubsequence(s,t));



    }

    static boolean isSubsequence(String s, String t) {
/*        char[] s2= s.toCharArray();
        char [] t2 = t.toCharArray();*/

        int count =0;
        int sIndex =0;
        int tIndex =0;
        while (sIndex < s.length() && tIndex < t.length()){
            if (s.charAt(sIndex) == t.charAt(tIndex)){
                sIndex++;
                tIndex++;
                count++;
            }else {
                tIndex++;
            }


        }
        if (count == s.length()){
            return true;
        }else {
            return false;
        }
    }

}
