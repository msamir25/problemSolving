package sqrt;

public class _Sqrt {
    public static void main(String[] args) {
        int myNumber = mySecendSol(8);
        System.out.println(myNumber);

    }

    static public int mySqrt(int x) {
        int mid = x / 2;
        int sol = 0;
        for (int i = 0; i < x; i++){
            if ((mid * i) >= x){
                sol = i;
                return sol;
            }

        }
        return sol;
    }

    static int mySecendSol(int x ){


        long left= 0;
        long right = (x / 2 ) + 1;

        while (left < right){
          long mid =   left+(right - left ) / 2 + 1;
          long square = mid * mid;
          if (square == x){
              return (int)mid;
          }else if (square < x ){
              left = mid;
          } else {
              right = mid - 1;
          }
        }
        return (int) left;
    }
}


