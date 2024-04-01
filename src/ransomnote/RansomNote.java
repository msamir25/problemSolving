package ransomnote;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {

        String magazine = "aab";
        Map<Character , Integer>magazineFreq = new HashMap<>();
        for (int i =0; i < magazine.length(); i++){
            if (magazineFreq.containsKey(magazine.charAt(i))){
                magazineFreq.put(magazine.charAt(i) , magazineFreq.get(magazine.charAt(i))+1);
            }else {
                magazineFreq.put(magazine.charAt(i), 1);
            }
        }




/*       for (Map.Entry<Character , Integer> entry : magazineFreq.entrySet()){
           System.out.print(" key :  " + entry.getKey() + "  value :" + entry.getValue());
       }*/


    }

        static boolean canConstruct(String ransomNote , String magazine){
            Map<Character , Integer>magazineFreq = new HashMap<>();
            for (int i =0; i < magazine.length(); i++){
                if (magazineFreq.containsKey(magazine.charAt(i))){
                    magazineFreq.put(magazine.charAt(i) , magazineFreq.get(magazine.charAt(i))+1);
                }else {
                    magazineFreq.put(magazine.charAt(i), 1);
                }
            }
            int count =0;
            for (int i=0; i<ransomNote.length(); i++){
                char ch = ransomNote.charAt(i);
                if (magazineFreq.containsKey(ch) && magazineFreq.get(ch) > 0){
                    count++;
                    magazineFreq.put(ch , magazineFreq.get(ch)-1);
                }else  {
                    break;
                }
                if (count == ransomNote.length()){
                    return true;
                }else {
                    return false;
                }
            }
        return false;
    }

    static boolean twoSum2(String ransomNote , String magazine){
        int [] freq = new int [26];
        for (int i=0; i< magazine.length(); i++){
            freq[magazine.charAt(i) - 'a']++;
        }
        for (int i=0; i < ransomNote.length(); i++){
            if (freq[ransomNote.charAt(i) - 'a'] == 0){
                return false;
            }else {
                freq[ransomNote.charAt(i) - 'a']--;
            }
        }
        return true;
    }
}
