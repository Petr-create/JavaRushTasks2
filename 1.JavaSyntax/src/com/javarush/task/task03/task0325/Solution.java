package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);

        String number = bf.readLine();
        int x = Integer.parseInt(number);
        System.out.println("Я буду зарабатывать $" + x + " в час");

    }
}
