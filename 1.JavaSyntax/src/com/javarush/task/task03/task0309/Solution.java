package com.javarush.task.task03.task0309;

/* 
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        int j = 1;
        for (int i = 0; i < 5; i++) {
            j = j + i;
            System.out.println(j);
            j++;
        }

    }
}
