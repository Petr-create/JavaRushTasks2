package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arrayInt = new int[10];
        String[] arrayString = new String[10];
        for (int i = 0; i < arrayString.length; i++) {
            arrayString[i] = reader.readLine();
        }
        for (int i = 0; i < arrayString.length; i++) {
            arrayInt[i] = arrayString[i].length();
        }
        for(int x : arrayInt){
            System.out.println(x);
        }
    }
}
