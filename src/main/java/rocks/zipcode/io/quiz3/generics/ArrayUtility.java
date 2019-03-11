package rocks.zipcode.io.quiz3.generics;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }

    public SomeType findOddOccurringValue() {
        SomeType result = null;
        for(SomeType st : array){
            if((getNumberOfOccurrences(st) % 2) == 1){
                result = st;
                break;
            }
        }
        return result;
    }

    public SomeType findEvenOccurringValue() {
        SomeType result = null;
        for(SomeType st : array){
            if((getNumberOfOccurrences(st) % 2) == 0){
                result = st;
                break;
            }
        }
        return result;
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Integer counter = 0;
        for(SomeType st : array){
            if(st.equals(valueToEvaluate)){
                counter++;
            }
        }
        return counter;
    }

    //TODO comeback to complete

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        List<SomeType> list = Arrays.asList(array);
        Stream<SomeType> stream = Arrays.stream(array).filter(st -> predicate.apply(st));
        Stream<SomeType> stream2 = list.stream().filter(st -> predicate.apply(st));
        return null;
    }
}