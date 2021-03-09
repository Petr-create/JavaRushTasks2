package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Минимаксы в массивах
*/

public class Solution {
    public static void main(String[] args) throws IOException {

        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        int[] array = getInts();

        for (int i = 0; i < array.length; i++) {
            if(array[i] > maximum){
                maximum = array[i];
            }
            if(array[i] < minimum){
                minimum = array[i];
            }

        }

        System.out.print(maximum + " " + minimum);
    }
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        return array;
    }
}
