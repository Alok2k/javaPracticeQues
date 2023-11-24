package streamAPI;

import java.util.Arrays;
import java.util.List;

//filtering name starts with j
public class p1 {
    public static void main(String[] args) {
        List<String> a= Arrays.asList("aman","sannu","joker");
        a.stream().filter((name)->!name.startsWith("j")).toList().forEach(System.out::println);

    }
}
