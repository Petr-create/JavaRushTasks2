package com.javarush.task.task04.task0412;

import java.io.*;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream stream = System.in;
        Reader reader = new InputStreamReader(stream);
        BufferedReader bf = new BufferedReader(reader);
        String n = bf.readLine();
        int number = Integer.parseInt(n);
        if(number > 0){
            number *= 2;
        } else if (number < 0){
            number += 1;
        }else{
            number = 0;
        }
        System.out.println(number);
    }

}