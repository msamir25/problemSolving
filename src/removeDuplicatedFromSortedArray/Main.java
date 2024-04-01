package removeDuplicatedFromSortedArray;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        int [] nums = new int[]{1,1,2};
        System.out.println(removeDuplicates(nums));
    }

    static int removeDuplicates(int [] arr){
        int size = arr.length;
        int count =0;
        for (int i=0; i <size; i++){
            if (i < size-1 && arr[i] == arr[i+1]){
                continue;
            }
            else {
                arr[count] = arr[i];
                count++;
            }
        }
        return count;
    }
}
