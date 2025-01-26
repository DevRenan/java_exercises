package LambdasStreamsOptionals;

import java.util.List;
import java.util.stream.Collectors;

public class StreamGroupingBy {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);
        var groupedList = list.stream().collect(Collectors.groupingBy(x -> x%3));
        System.out.println(groupedList);
        var mapCount = list.stream().collect(Collectors.groupingBy(e-> list.stream().filter(f-> f%e==0).collect(Collectors.toList())));
        System.out.println(mapCount);
        list.stream().collect(Collectors.groupingBy(e-> Collectors.counting()));
    }
}
