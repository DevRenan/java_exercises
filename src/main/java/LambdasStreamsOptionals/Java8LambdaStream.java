package LambdasStreamsOptionals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Java8LambdaStream {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        iterateWithLambda(list);
        iterateWithOutLambda(list);
    }

    private static void iterateWithOutLambda(List<Integer> list) {
        list.stream().forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
                              }
        );
    }


    private static void iterateWithLambda(List<Integer> list) {
        list.stream().forEach(System.out::println);
    }
}
