package com.javarush.task.task04.task0418;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Минимум двух чисел Ӏ Java Syntax: 4 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);
        String number1 = bf.readLine();
        String number2 = bf.readLine();
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        if (n1 < n2) {
            System.out.println(n1);
        } else if (n1 == n2) {
            System.out.println(n1);
        } else {
            System.out.println(n2);
        }
    }
}