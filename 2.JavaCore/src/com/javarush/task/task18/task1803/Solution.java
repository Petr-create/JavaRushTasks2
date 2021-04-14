package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file);
        List<Integer> list = new ArrayList<>();

        int[] array = new int[256];

        while(fileInputStream.available() > 0){
            array[fileInputStream.read()]++;
        }
        int max = 0;
        for (int i : array){
            if(i > max){
                max = i;
            }
        }

        for (int i = 0; i < array.length; i++) {
           if(array[i] == max){
               list.add(i);
           }
        }

        for (Integer x : list){
            System.out.print(x + " ");
        }


        fileInputStream.close();
    }
}
