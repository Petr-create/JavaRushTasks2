package com.javarush.task.task05.task0507;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Среднее арифметическое
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);
        int sum = 0;
        double count = 0;
        while(true){
            String s = bf.readLine();
            int number = Integer.parseInt(s);
            if(number == -1){
                break;
            }
            sum += number;
            count++;
        }
        System.out.println(sum / count);
    }
}

