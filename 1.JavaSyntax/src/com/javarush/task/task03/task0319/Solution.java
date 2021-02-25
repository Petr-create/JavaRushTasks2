package com.javarush.task.task03.task0319;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Предсказание на будущее
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStreamReader = System.in;
        Reader reader = new InputStreamReader(inputStreamReader);
        BufferedReader bfreader = new BufferedReader(reader);

        String name = bfreader.readLine();
        int number1 = Integer.parseInt(bfreader.readLine());
        int number2 = Integer.parseInt(bfreader.readLine());

        System.out.println(name + " получает " + number1 + " через " + number2 + " лет.");

    }
}
