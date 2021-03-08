package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            arrayList.add(reader.readLine());
        }
        int max = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length() > max){
                max = arrayList.get(i).length();
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length() < min){
                min = arrayList.get(i).length();
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if(arrayList.get(i).length() == min || arrayList.get(i).length() == max){
                System.out.println(arrayList.get(i));
                return;
            }
        }
    }
}
