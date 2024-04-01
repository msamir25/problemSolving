package mergesortedarray;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int [] myArr = new int[] {1,2,3,0,0,0};
        int [] myArr2 = new int[] {2,5,6};
        int  m = 3;
        int n =3;

        Sol s = new Sol();
        s.merge(myArr , m , myArr2 ,n);
        for (Integer arr:myArr) {
            System.out.println(arr);
        }
    }


}

class Sol {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = m+n-1;
        while (j>=0){

            if (i >=0 && nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                k--;
                i--;
            }else {
                nums1[k] = nums2[j];
                k--;
                j--;
            }
        }

    }
}
