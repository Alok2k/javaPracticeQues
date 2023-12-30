package gfg;

public class nto1recursion {

    static void recursion(int n){
        if (n==0){
            return;
        }
        System.out.println(n);
        recursion(n-1);
    }

    public static void main(String[] args) {
        recursion(5);
    }
}
