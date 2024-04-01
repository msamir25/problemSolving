package majorityElement;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};

        System.out.println(majorityElement(arr));
    }
    static int majorityElement(int[] nums) {

        int size = nums.length / 2;

        Map<Integer , Integer> freq = new HashMap<>();

        for (int num: nums){
            freq.put(num , freq.getOrDefault(num , 0)+1);
        }
        for (Map.Entry<Integer , Integer>numsfreq : freq.entrySet()){
            if (numsfreq.getValue() > size){
                return numsfreq.getKey();
            }
        }
        return 0;
    }
}
