package streamAPI;

import java.util.HashMap;

public class products {
    public static void main(String[] args) {
        HashMap<String,Integer> prod=new HashMap<>();
        prod.put("lenovo",200);
        prod.put("Mac",2000);
        prod.put("HP",90);
        prod.put("Asus",2500);

        prod.entrySet().stream().filter(e->e.getValue()>400).map(e->e.getValue()+50).forEach(System.out::println);


    }
}
