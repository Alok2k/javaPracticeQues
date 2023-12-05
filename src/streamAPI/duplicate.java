package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class duplicate {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Map.Entry<Integer, Long>> entries = myList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
        List<Map.Entry<Integer, Long>> list = entries.stream().filter(a->a.getValue() > 2).toList();
        System.out.println(list);

    }}
