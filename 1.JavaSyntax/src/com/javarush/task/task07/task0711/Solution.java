package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
        for (int i = 0; i < 13; i++) {
            String q = arrayList.remove(arrayList.size() - 1);
            arrayList.add(0, q);
        }
        for(String s : arrayList){
            System.out.println(s);
        }
    }
}
