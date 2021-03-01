package com.javarush.task.task04.task0434;

/* 
Таблица умножения Ӏ Java Syntax: 4 уровень, 10 лекция
*/

public class Solution {
    public static void main(String[] args) {
        int k = 0;
        int i = 0;
        while (i < 10){
            k++;
            int t = 0;
            int j = 0;
            while (j < 10){
                t += k;
                System.out.print(t + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
