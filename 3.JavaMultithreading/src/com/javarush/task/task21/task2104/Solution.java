package com.javarush.task.task21.task2104;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* 
Equals and HashCode
*/

public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if(this == n){
            return true;
        }
        if(n == null){
            return false;
        }
        if(this.getClass() != n.getClass()){
            return false;
        }
//        if (!(n instanceof Solution)) return false;
        Solution sol = (Solution) n;

//        return (first == sol.first || (first != null && first.equals(sol.first))) &&
//                (last == sol.last || (last != null && last.equals(sol.last)));
//        return Objects.equals(first, sol.first) && Objects.equals(last, sol.last);
        if (first != null ? !first.equals(sol.first) : sol.first != null){
            return false;
        }
        return last != null ? last.equals(sol.last) : sol.last == null;

    }

    public int hashCode() {
        int result = first != null ? first.hashCode() : 0;
        result = 31 * result + (last != null ? last.hashCode() : 0);
        return result;
    }


    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));

        Solution s1 = new Solution("Дональд", "утка");
        Solution s2 = new Solution("Недональд", "неутка");
        Solution s3 = new Solution("Дональд", "утка");
        Solution s4 = new Solution("Дональд", null);
        Solution s5 = new Solution(null, "утка");
        Solution s6 = new Solution(null, "утка");



        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println();

        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
        System.out.println(s1.hashCode() == s3.hashCode());
        System.out.println();

        System.out.println(s1.equals(s4));
        System.out.println(s5.equals(s1));
        System.out.println(s5.equals(s6));
    }
}
