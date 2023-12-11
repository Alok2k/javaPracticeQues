package leetcode;
import java.util.Arrays;
import java.util.List;


public class median {
    public static void main(String[] args) {
        int []a={1,2,5};
        int [] b={3,4,6,33,55,2};
        int []c=new int[a.length+b.length];
        int pos=0;
        for (int e:a){
            c[pos]=e;
            pos++;
        }
        for(int e:b){
            c[pos]=e;
            pos++;
        }

        List<Integer> d= Arrays.stream(c).sorted().boxed().toList();
        if(d.size()%2==0){
            System.out.println("even");
            System.out.println(d.get(d.size()/2)+ d.get((d.size())-1)/2);
        }else {
            System.out.println("odd");
            System.out.println(d.get((d.size())/2));}


    }
}
