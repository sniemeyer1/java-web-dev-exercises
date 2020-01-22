package exercises;

import java.util.ArrayList;

public class Sum {
    public static Double getSum(){

        ArrayList<Integer> someNums = new ArrayList<>();
        someNums.add(1);
        someNums.add(2);
        someNums.add(3);
        someNums.add(4);
        someNums.add(5);
        someNums.add(6);
        someNums.add(7);
        someNums.add(8);
        someNums.add(9);
        someNums.add(10);
        System.out.println(someNums);

        double sum = 0.0;

        for (int i : someNums) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
