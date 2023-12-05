package streamAPI;

import java.util.Arrays;
import java.util.List;


public class distinct {
    public static void main(String[] args) {
        List<Integer> l1= Arrays.asList(1,33,44,33,1,23,65,98);
       l1.stream().distinct().sorted().filter(a->a>22)
        .toList().forEach(System.out::println);

    }
}
