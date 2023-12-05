package kore;

public class prime {
    public static void main(String[] args) {
        int a=14;

            if(a==0||a==1){
                System.out.println("not prime");
            } else {
                for (int i=2;i<a/2;i++){
                    if (a%i==0){
                        System.out.println("npt prime");
                    }
                }
        }


    }
}
