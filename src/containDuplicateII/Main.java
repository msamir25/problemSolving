package containDuplicateII;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,0,1,1}; int k = 1;
        System.out.println(containsNearbyDuplicate(nums , k));
    }

    static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> namsMap = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (namsMap.containsKey(nums[i]) &&  Math.abs(i - namsMap.get(nums[i])) <= k){
                        return true;
                    }
                namsMap.put( nums[i] , i);
            }
            return false;
        }


    }

