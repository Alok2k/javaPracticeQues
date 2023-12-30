package leetcode;

import java.math.BigInteger;

public class stringmultipy {
    public static void main(String[] args) {
        String a="6913259244";
        String b="71103343";

        BigInteger x=new BigInteger(a);
        BigInteger y=new BigInteger(b);
        BigInteger z= x.multiply(y);


        String d= String.valueOf(z);
        System.out.println(d);


    }
}
