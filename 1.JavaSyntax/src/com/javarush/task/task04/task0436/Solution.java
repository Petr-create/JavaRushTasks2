package com.javarush.task.task04.task0436;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Рисуем прямоугольник
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);
        String number1 = bf.readLine();
        String number2 = bf.readLine();
        int num1 = Integer.parseInt(number1);
        int num2 = Integer.parseInt(number2);

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}
