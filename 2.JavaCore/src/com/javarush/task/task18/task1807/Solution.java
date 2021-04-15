package com.javarush.task.task18.task1807;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        byte[] array = new byte[fileInputStream.available()];
        fileInputStream.read(array);
        int count = 0;
        for(byte b : array){
            if(b == 44){
                count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
    }
}
