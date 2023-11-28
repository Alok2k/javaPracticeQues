package collections;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringQues {
    public static void main(String[] args) {
        String str="hello World kse ho";

       List<Character>ch= str.chars().mapToObj(c->(char)c).toList();
      Map<Character,Long> m= ch.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      HashMap<Character,Long> hm=new HashMap<>(m);
        System.out.println(hm);


    }
}
