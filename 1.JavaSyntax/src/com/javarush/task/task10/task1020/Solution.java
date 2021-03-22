package com.javarush.task.task10.task1020;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам Ӏ Java Syntax: 10 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[30];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        System.out.println(array[9]);
        System.out.println(array[10]);
    }

    public static void sort(int[] array) {
        int[] copy = Arrays.copyOf(array, array.length);
        for (int j = 0; j < array.length; j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < copy.length; i++) {
                if(copy[i] <= min){
                    min = copy[i];
                }
            }
            array[j] = min;
            for (int i = 0; i < copy.length; i++) {
                if(copy[i] == min){
                    copy[i] = Integer.MAX_VALUE;
                    break;
                }
            }
        }
    }
}
//for (int i = 0; i < array.length; i++) {
//        for (int j = i; j < array.length; j++) {
//        if (array[i] > array[j]) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//        }
//        }
//        }