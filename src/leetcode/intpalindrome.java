package leetcode;

public class intpalindrome {
     public  boolean isPalindrome(int x) {
         if(x<0 || x!=0 && x%10 ==0 ) {return false;}
         int rev=0;
         while (x>rev){
             int d=x%10;
              rev=rev*10+d;
              x=x/10;

         }
         return (x==rev||x==rev/10);




    }

    public static void main(String[] args) {
         intpalindrome ab=new intpalindrome();
        boolean result = ab.isPalindrome(121121);
        System.out.println(result);
    }
}
