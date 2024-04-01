package findTriplets;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 1;
        List<List<Integer>> triplets = findTriplets(nums, target);
        System.out.println(triplets);
    }

    public static List<List<Integer>> findTriplets(int[] nums, int target) {
        List<List<Integer>> triplets = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        // Sort the array to efficiently use two pointers
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; // Skip duplicates to avoid non-unique triplets
            }
            int current = nums[i];
            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                int sum = current + nums[j] + nums[k];
                if (sum == target) {
                    triplets.add(List.of(current, nums[j], nums[k]));
                    j++;
                    k--;
                    // Skip duplicates to avoid non-unique triplets
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                } else if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }

        return triplets;
    }

}
