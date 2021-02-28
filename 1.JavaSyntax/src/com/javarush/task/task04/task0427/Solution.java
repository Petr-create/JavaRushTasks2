package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);
        String number = bf.readLine();
        int num = Integer.parseInt(number);
        if(num > 0 && num < 1000) {
            if (number.length() == 1) {
                if (whatNumber(num)) {
                    System.out.println("четное однозначное число");
                } else {
                    System.out.println("нечетное однозначное число");
                }
            } else if (number.length() == 2) {
                if (whatNumber(num)) {
                    System.out.println("четное двузначное число");
                } else {
                    System.out.println("нечетное двузначное число");
                }
            } else if (number.length() == 3) {
                if (whatNumber(num)) {
                    System.out.println("четное трехзначное число");
                } else {
                    System.out.println("нечетное трехзначное число");
                }
            }
        }
    }

    public static boolean whatNumber(int num) {
        return num % 2 == 0;
    }
}
