package twosums;

import java.util.HashMap;
import java.util.Map;

public class TwoSums2 {
    public static void main(String[] args) {
        int [] ans = new int [2];
                ans = twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ans[0] + " " + ans[1]);
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
