package rocks.zipcode.io.quiz3.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class SquareArrayAnalyzer {
    public static Boolean compare(Integer[] input, Integer[] squaredValues) {
        List<Integer> list = Arrays.asList(squaredValues);
        Boolean result = true;
        for (Integer i : input){
            if(!list.contains(i*i)){
                result = false;
                break;
            }
        }
        return result;
    }


}
