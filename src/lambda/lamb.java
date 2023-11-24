package lambda;

public class lamb {
    public static void main(String[] args) {

//        myIntrf i=new myIntrf() {
//            @Override
//            public void hi() {
//                System.out.println("hello");
//            }
//        };
//        i.hi();

        //using lambda expression

        myIntrf i=()->{
            System.out.println("hi lambda");
        };
        i.hi();

        sum j=(a,b)->{
            System.out.println(a+b);
        };
        j.sum(1,2);

        sum k=(a,b)->{
            System.out.println(a*b);
        };
        k.sum(2,7);
    }
}
