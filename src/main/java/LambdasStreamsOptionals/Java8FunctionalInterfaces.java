package LambdasStreamsOptionals;


import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class Java8FunctionalInterfaces {
    public static void main(String[] args) {
        Stream.generate(() -> new Random().nextInt()) //suplier
                .limit(10)
                .forEach(System.out::println); //consumer

        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .filter(n -> n % 2 == 0) //predicate
                .map(Integer::doubleValue)//function
                .reduce((a, b) -> a + b) //BinaryOperator
                .ifPresent(System.out::println);

    }
}
