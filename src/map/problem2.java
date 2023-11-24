package map;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class problem2 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("alok");
        list.add("slkhd");list.add("dfvfc");list.add("dfb");
        list.forEach(v-> System.out.println(v));
        System.out.println(Arrays.toString(list.toArray()));



    }
}
