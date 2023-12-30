package gfg;

import javax.imageio.stream.ImageInputStream;

public class naturalno {

    static int recursnSum(int n){
        if (n==1){
            return 1;
        }
        else {
            return n+recursnSum(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(recursnSum(5));
    }
}
