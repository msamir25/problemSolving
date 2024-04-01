package palindromenumber;

public class PalindromeNumber {
    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.isPalindrome(121));
    }
}

class Solution2 {
    public boolean isPalindrome(int x) {

        int temp =x;

        if(x <= 0 ){
            return false;
        }
        if(x % 10 == 0){
            return false;
        }

        int sum =0;
        while (temp !=0){
            int load =0;
            load =temp %10;
            temp/=10;
            if (load<temp){
                load*=10;
                System.out.println(sum);
            }
            sum =+load;
            System.out.println(sum);



        }if (sum == x)
        return true;
        else return false;
    }
}
