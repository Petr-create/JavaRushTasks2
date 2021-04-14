package com.javarush.task.task18.task1802;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String fileName = bufferedReader.readLine();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        int min = Integer.MAX_VALUE;
        while(fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if(min > data){
                min = data;
            }
        }
        System.out.println(min);
        fileInputStream.close();
    }
}
