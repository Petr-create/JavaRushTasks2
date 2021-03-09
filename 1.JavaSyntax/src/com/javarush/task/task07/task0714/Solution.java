package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Слова в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(reader.readLine());
        }
        arrayList.remove(arrayList.get(2));
        for (int i = 0; i < arrayList.size(); i++) {
            String s = arrayList.get(arrayList.size() - 1 - i);
            System.out.println(s);
        }
    }
}
