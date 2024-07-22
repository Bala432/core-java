package src.com.basics.generics;

import java.util.ArrayList;
import java.util.List;

public class LambdaFunctions {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(6);
        list.add(1);

        list.forEach( (item) ->
            System.out.println(item)
        );
    }
}
