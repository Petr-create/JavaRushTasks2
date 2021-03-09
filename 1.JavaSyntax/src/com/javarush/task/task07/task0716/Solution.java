package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("роза");
        strings.add("лоза");
        strings.add("лира");
        strings = fix(strings);

        for (String string : strings) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> strings) {
        int i = 0;
        do {
            if (strings.get(i).contains("р") && strings.get(i).contains("л")) {
                i++;
                continue;
            }
            if (strings.get(i).contains("р")) {
                strings.remove(i);
                continue;
            }
            if (strings.get(i).contains("л")) {
                strings.add(i, strings.get(i));
                i += 2;
                continue;
            }
            i++;
        } while (i < strings.size());

        return strings;
    }
}