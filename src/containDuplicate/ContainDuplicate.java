package containDuplicate;

import java.util.HashSet;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContainDuplicate {
    public static void main(String[] args) {
        Solution mySolution = new Solution();
        int [] arr = new int[]{1 ,2 , 3 , 4};
        System.out.println(mySolution.containsDuplicate(arr));

    }
}
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>setNums = new HashSet<>();
        for (int i=0; i<nums.length;i++){
            if (setNums.contains(nums[i])){
                return true;
            }
            setNums.add(nums[i]);
    }
        return false;
}


//class containDuplicate.Solution {
//
//    public boolean containsDuplicate(int[] nums) {
//        Arrays.sort(nums);
//        int size=nums.length;
//        for (int i=0; i<size-1;i++){
//            if (nums[i] == nums[i+1]){
//                return true;
//            }
//        }return false;
//
//    }




//    public boolean containsDuplicate(int[] nums) {
//        int temp;
//        int size = nums.length;
//        for (int i =0; i< size; i++){
//            for (int y =i+1; y<size; y++){
//                if (nums[i]== nums[y]){
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
}