package com.javarush.task.task05.task0532;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Задача по алгоритмам Ӏ Java Syntax: 5 уровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum;
        int N = Integer.parseInt(reader.readLine());
        if(N <= 0){
            return;
        }
        int[] mas = new int[N];
        for (int i = 0; i < N; i++) {
            mas[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < mas.length - 1; i++) {
            for (int j = 1; j < mas.length; j++) {
                if(mas[i] > mas[j]){
                    mas[j] = mas[i];
                }
            }
        }
        maximum = mas[N-1];
        System.out.println(maximum);
    }
}
