package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("мама");
        arrayList.add("мыла");
        arrayList.add("раму");
        for (int i = 0; i < arrayList.size(); i += 2) {
            arrayList.add(i + 1, "именно");
        }
        for (String s : arrayList){
            System.out.println(s);
        }
    }
}
