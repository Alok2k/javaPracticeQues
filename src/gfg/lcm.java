package gfg;

public class lcm {
    static int gcd(int a,int b){
        while (a!=0&&b!=0){
            if (a>b){
                a=a%b;
            }else {
                b=b%a;
            }
        }
        if (a!=0){
            return a;
        }else {
            return b;
        }
    }
    static int lcmfinder(int a,int b){
        return (a*b)/gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println( lcmfinder(12,44));
    }
}
