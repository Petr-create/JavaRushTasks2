package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самая длинная строка
*/

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        String max = "";
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() > max.length()){
                max = strings.get(i);
            }
        }
        for (int i = 0; i < strings.size(); i++) {
            if(strings.get(i).length() == max.length()){
                System.out.println(strings.get(i));
            }
        }
    }
}
