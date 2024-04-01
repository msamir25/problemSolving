package twosums;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSums {

    public static void main(String[] args) {
        int [] arr = {3,3};
        System.out.println(Arrays.toString(twoSums( arr , 6)));
    }

    /*
         n = (5 ,2 , 4)
         target = 6

     */

     static int [] twoSums(int n[] ,int target){
        Map<Integer , Integer> complements = new HashMap<>();
        for (int i =0; i<n.length; i++){
            Integer complementsIndx = complements.get(n[i]);
            if (complementsIndx !=  null){
                return new int[]{complementsIndx , i};
            }else {
                complements.put(target - n[i] , i);
            }
        }
        return n;
    }
}
