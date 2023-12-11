package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stringpalin {
    public static void main(String[] args) {
        String s="babad";
        Set<String> set=new HashSet<>();
        for (int start = 0; start < s.length(); start++) {
            for (int end = start + 1; end <= s.length(); end++) {
                String temp=s.substring(start,end).toLowerCase();
                set.add(temp);
                //System.out.println(temp);
            }
        }
        //System.out.println(set);
        List<String> newstr = set.stream().filter((a) -> a.contentEquals(new StringBuilder(a).reverse())).toList();
        int maxLength = newstr.stream()
                .map(String::length)
                .max(Integer::compareTo)
                .orElse(0);
        List<String> element = newstr.stream()
                .filter(a -> a.length() == maxLength).collect(Collectors.toList());

        System.out.println(element.get(0));



    }

}
