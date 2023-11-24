package streamAPI;
import java.util.Arrays;
import java.util.List;

//squaring nums in list
public class Squarenum {
    public static void main(String[] args) {
        List<Integer> num= Arrays.asList(1,43,6,78,9,88);
       num.stream().map((n) -> n * n).toList().forEach(System.out::println);

    }
}
