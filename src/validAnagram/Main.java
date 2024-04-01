package validAnagram;



public class Main {
    public static void main(String[] args) {
        String s = "cat", t = "rat";

        System.out.println(isAnagram(s,t));

    }
    static boolean isAnagram(String s , String t){

        char [] c = new char[26];

        if (s.length() != t.length()){
            return false;
        }

        for (int i=0; i< s.length(); i++){
            c[s.charAt(i) - 'a']++;
            c[t.charAt(i) - 'a']--;
        }
        for (int i=0; i< c.length; i++){
            if (c[i] != 0){
                return false;
            }
        }
        return true;
    }
}
