package plusone;

//1- find the size
//2-find the last digit if  arr [size-1] = 9
//        then new arr size n+1
//3-form is sum =sum + arr[i] *10
//add 1 to sum


import java.util.Arrays;

public class PlusOne {


    public static int[] plusOne(int[] digits) {

  /*      int size = digits.length;
        int newSize = 0;
        int count =0;
        for (int i=0; i<size; i++){
            if (digits[i] == 9) {
                count++;
                if (count == size){
                newSize = size + 1;}
            } else newSize = size;
        }



        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum = sum * 10 + digits[i];
        }
        sum += 1;

        int[] arr = new int[newSize];
        for (int i = newSize - 1; i >= 0; i--) {
            arr[i] = sum % 10;
            sum = sum / 10;
        }


        return arr;*/

        int n = digits.length;

        for (int i = n-1; i>=0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] =0;
        }
            int [] newArr = new int[n+1];
            newArr[0] = 1;
            return newArr;

    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int[] arr2 = plusOne(arr);
        System.out.println(Arrays.toString(arr2));

    }

}

