package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);
        String number1 = bf.readLine();
        String number2 = bf.readLine();
        String number3 = bf.readLine();
        int n1 = Integer.parseInt(number1);
        int n2 = Integer.parseInt(number2);
        int n3 = Integer.parseInt(number3);
        int[] array = new int[3];
        array[0] = n1;
        array[1] = n2;
        array[2] = n3;
        for (int i = 0; i < 2; i++) {
            for (int j = 1; j < 3; j++) {
                if(array[i] < array[j]){
                    int m = array[j];
                    array[j] = array[i];
                    array[i] = m;
                }
            }
        }
        for (int i : array){
            System.out.print(i + " ");
        }

    }
}
