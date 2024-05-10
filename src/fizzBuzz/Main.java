package fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> words = fizzBuzz(15);
        for (String s: words){
            System.out.print( "  " +s);
        }
    }

    static List<String> fizzBuzz(int n) {
        List<String> words = new ArrayList<>();

        for (int i=1; i<= n; i++){
            if ((i % 3 == 0) && (i % 5 ==0)){
                words.add( "FizzBuzz");
            }

           else if (i % 3 == 0){
                words.add("Fizz");
            } else if (i % 5 == 0) {
                words.add("Buzz");
            }else {
               words.add(String.valueOf(i));
            }


        }
        return words;
    }
}
