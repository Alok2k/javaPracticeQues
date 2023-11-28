package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//merging list of different types
public class p4 {
    public static void main(String[] args) {
        List<String> l= Arrays.asList("banana","Apple","mango","Watermelon","Strawberry");
        List<String> l1= Arrays.asList("banana","Apple","mango","Watermelon","Strawberry");
        List<Integer>l2=Arrays.asList(11,22,33,44,55);
        System.out.println(Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList()));

        //Addon
        List<String>l4=new ArrayList<>();
        l4.addAll(l1);
        l4.addAll(l);
        System.out.println(l4.stream().sorted().collect(Collectors.toList()));


    }
}
