package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class sannu {
    public static void main(String[] args) {
        List<Integer> l= Arrays.asList(1,2,3,4,5,6,3);

        List<Integer> b = IntStream.range(0, l.size()).filter(i->i%2==0)
                .mapToObj(i -> (i < l.size() - 1) ? l.get(i) + l.get(i + 1) : l.get(i))
                .collect(Collectors.toList());

        System.out.println(b);
    }
}
