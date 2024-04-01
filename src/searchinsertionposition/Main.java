package searchinsertionposition;

public class Main {
    public static void main(String[] args) {
        int [] nums = {1,3,5,6};
        System.out.println(searchInsert(nums , 7));
    }

    static int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (low <= high) {

            int mid = (low + high) / 2;
            //if it in the middle
            if (target == nums[mid]) {
                return mid;
            }else
            if (target > nums[mid]) {
                low = mid + 1;
            }
            if (target < nums[mid]) {
                high = mid - 1;
            }
        }

        return low;
    }
}
