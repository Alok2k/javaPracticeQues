package kore;

import java.util.List;
import java.util.Scanner;


public class arms {

//    static void sum(int n){
//
//    }
    public static void main(String[] args) {
//        //armstorng num check
//        //12
//        int sum=0;
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        int n1=n;
//        int length=(int) Math.log10(n)+1;
//        System.out.println(length);
//        while (n1>0){
//            int d=n1%10;
//             sum=sum+d;
//            n1=n1/10;
//        }
//
//        if (sum==length*length)
//            System.out.println("arms");
//        else System.out.println("not");


        List<Integer> a=List.of(154);
        boolean result=a.stream().allMatch(arms::isArms);

        System.out.println(result);




    }
    public static boolean isArms(int number){
        int orginalNum=number;
        int n=(int) Math.log10(number)+1;
        int result=String.valueOf(number).chars().map(i->(int)Math.pow(Character.getNumericValue(i),n))
                .reduce(0,Integer::sum);
        return result== orginalNum;
    }
}
