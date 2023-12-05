package kore;

import java.util.Scanner;

//reverse Str && Int
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String n= sc.next();
//
//        for (int i=n.length()-1;i>=0;i--){
//            System.out.println(n.charAt(i));
//
//        }

        int num=sc.nextInt();
        String n= Integer.toString(num);

        for (int i=n.length()-1;i>=0;i--){
            System.out.print(n.charAt(i));
        }

    }
}
