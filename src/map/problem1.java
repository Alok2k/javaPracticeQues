//storing and retreving name and contacts
package map;

import java.util.HashMap;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        System.out.println("enter number of contacts you want to save");
        Scanner sc=new Scanner(System.in);
        int no= sc.nextInt();
        HashMap<String,String> contacts=new HashMap<>();

        for (int i=0;i<no;i++){
            System.out.println("enter name");
            String name=sc.next();
            System.out.println("enter phone");
            String phone=sc.next();
            contacts.put(name, phone);
        }
        contacts.forEach((K,V)-> System.out.println(K +"  "+ V));
        System.out.println("enter name whose phone no u want to get");
        String getnamee=sc.next();
        System.out.println(contacts.getOrDefault(getnamee, "not found"));



    }
}
