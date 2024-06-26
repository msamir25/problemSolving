package addbinary;

public class Main {
    public static void main(String[] args) {
        String  a= "1010" , b = "1011";
        System.out.println(addBinary(a,b));

    }

    static String addBinary(String a , String b){
        int i =a.length() -1;
        int j= b.length() -1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while ( i >= 0 || j >= 0){
            int sum = carry;
           if (i >= 0) sum += a.charAt(i--) - '0';
           if (j >= 0) sum += b.charAt(j--) - '0';

           carry = sum > 1 ? 1 : 0;
           sb.append(sum % 2);
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }
}
