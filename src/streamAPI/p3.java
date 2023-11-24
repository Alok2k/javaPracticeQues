package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//filtering elements that starts with uppercase and lowercase
public class p3 {
    public static void main(String[] args) {
        List<String> l1= Arrays.asList("banana","Apple","mango","Watermelon","Strawberry");
       List<String> l2= l1.stream().filter(fruits->Character.isUpperCase(fruits.charAt(0))).collect(Collectors.toList());
        l2.forEach(System.out::println);
        System.out.println("Starts with lower case");
        System.out.println("");
        l1.stream().filter(f->Character.isLowerCase(f.charAt(0))).collect(Collectors.toList()).forEach(System.out::println);
 }
}