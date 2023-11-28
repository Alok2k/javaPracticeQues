package streamAPI;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//The Stream.flatMap() function, as the name suggests,
// is the combination of a map and a flat operation.
// This means you first apply the map function and then flatten the result.
public class flatmap {
    public static void main(String[] args) {
        List<Integer>l1= Arrays.asList(1,2,3,4,5,6);
        List<Integer>l2=Arrays.asList(11,22,33,44,55);
        List<Integer>l3=Stream.of(l1,l2).flatMap(Collection::stream).toList();
        l3.forEach(System.out::println);
        System.out.println(l3);



    }
}
