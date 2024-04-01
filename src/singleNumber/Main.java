package singleNumber;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1};
        System.out.println(singleNumber(nums));
    }

    static int singleNumber(int [] nums){
        Map<Integer , Integer>freq = new HashMap<>();
        for (int i=0; i<nums.length; i++){
            freq.put(nums[i] , freq.getOrDefault(nums[i] ,0)+1);
        }
        for (Map.Entry<Integer , Integer> entry: freq.entrySet()){
            if (entry.getValue() < 2){
                return entry.getKey();
            }
        }
        return 0;
    }
}
