package gfg;
public class palindromerecursion {
   static boolean isPalin(String str, int start ,int end){
        if (start>=end){
            return true;
        }
        else{
            return (str.charAt(start)==str.charAt(end))&&isPalin(str, start+1, end-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalin("naman",0,4));;
    }
}
