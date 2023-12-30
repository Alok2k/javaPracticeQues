package gfg;

public class palin {
    public static void main(String[] args) {
        int x=121;
        int temp=x;
        int res=0;
        while (temp!=0){
            res=res*10+temp%10;
            temp=temp/10;
        }
        System.out.println(res);
        if (x==res) System.out.println("pali");
        else System.out.println("not p");
    }
}
