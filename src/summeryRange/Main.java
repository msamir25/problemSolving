package summeryRange;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ranges = summaryRanges(new int[]{0,1,2,4,5,7});

        for (String s: ranges){
            System.out.println(s);
        }
    }

    public static List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        if (nums.length == 1) return List.of(String.valueOf(nums[0]));

        for (int i = 0; i< nums.length; i++){
            int a = nums[i];

            while (i+1 < nums.length && nums[i+1] - nums[i] == 1){
                i++;
            }

            if (a != nums[i]){
                result.add(a + "->" + nums[i]);
            }
            else {
                result.add(String.valueOf(a));
            }

        }
        return result;
    }
}
