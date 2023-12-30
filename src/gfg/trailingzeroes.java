package gfg;

public class trailingzeroes {
    public static void main(String[] args) {
        int x=100;
        int res=0;

        for (int i=5;i<x;i=i*5){
            res=res+x/i;


        }
        System.out.println(res);
    }
}
