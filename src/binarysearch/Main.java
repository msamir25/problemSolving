package binarysearch;

public class Main {
    public static void main(String[] args) {
        int [] nums = {-1,0,3,5,9,12} ; int target = 2;
        System.out.println(search(nums , target));
    }

    static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high){
            int mid = (low + high) / 2;

            if (nums[mid] == target){
                return mid;
            }
            if (nums[mid] < target){
                low = mid + 1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
