package leetcode;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class anagram {
    public boolean isAnagram(String s, String t) {
        char []arr=s.toCharArray();
        char []arr2=t.toCharArray();
        Arrays.sort(arr);
        Arrays.sort(arr2);

        return (boolean)(Arrays.equals(arr,arr2));
    }

    public static void main(String[] args) {
        String s="alok";
        String t="kloaj";
        anagram a=new anagram();
        boolean res=a.isAnagram(s,t);
        System.out.println(res);

    }
}
