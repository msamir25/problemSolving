package pascalTriangle;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<List<Integer>> result = generate(5);

        for (List items : result){
            System.out.println(items.toString());
        }
    }

    static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0)return result;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);

        if (numRows == 1) return result;

        for (int i =1; i < numRows; i++){
            List<Integer> prev = result.get(i -1);

            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j =0; j <i-1; j++){
                row.add(prev.get(j) + prev.get(j+1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
