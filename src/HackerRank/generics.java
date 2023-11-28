package HackerRank;
public class generics {

    public static <T> void printArray(T[] a){

        for(T o:a){
            System.out.println(o);
        }

    }
    public static void main(String[] args) {

        Integer [] a={1,2,3};
        String [] str={"Hello","World"};
        printArray(a);
        printArray(str);
    }
}
