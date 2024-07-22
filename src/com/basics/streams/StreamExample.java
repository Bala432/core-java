package src.com.basics.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);

//        int list_count = (int) list.stream().filter(ele -> ele > 2).count();
//        System.out.println(list_count);

//        List<Integer> squared_list = list.stream().map(ele -> ele * ele).collect(Collectors.toList());
//        System.out.println(squared_list);

//        int list_sum = list.stream().reduce((Integer a, Integer b) -> a + b ).get();
//        System.out.println(list_sum);

//        int minimumElement = list.stream().min((Integer a, Integer b) -> a - b ).get();
//        int maximumElement = list.stream().min((Integer a, Integer b) -> b - a ).get();
//        System.out.println(minimumElement);
//        System.out.println(maximumElement);

        boolean isMatched = list.stream().anyMatch(element -> element > 3 );
        boolean isAllMatched = list.stream().allMatch(element -> element > 3 );
        System.out.println(isMatched);
        System.out.println(isAllMatched);
    }
}
