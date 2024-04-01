package removeElements;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int [] nums = new int[]{3,2,2,3};
        int val = 3;
        System.out.println(removeElement(nums , val));

    }
    static int removeElement(int[] nums, int val) {
        int validSize =0;
        for (int i =0; i<nums.length;i++){
            if (nums[i] != val){
                nums[validSize] = nums[i];
                validSize++;
            }

        }
        Arrays.stream(nums).forEach(System.out::println);
        return validSize;
    }
}
