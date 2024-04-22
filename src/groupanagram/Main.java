package groupanagram;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String [] strs =  {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> result = groupAnagrams(strs);

        for (List<String> map: result){
            for (String s : map){
                System.out.println(s);
            }
        }


    }

  static List<List<String>> groupAnagrams(String[] strs) {

        Map<String , List<String>> result = new HashMap<>();

        for (int i =0; i< strs.length; i++){
            char [] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);

            if (!result.containsKey(sortedWord)){
                result.put(sortedWord , new ArrayList<>());
            }

            result.get(sortedWord).add(strs[i]);
        }

        return new ArrayList<>(result.values());

  }

    }





