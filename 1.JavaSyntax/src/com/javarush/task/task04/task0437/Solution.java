package com.javarush.task.task04.task0437;

/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        int k = 0;
        for (int i = 0; i < 10; i++) {
            k++;
            for (int j = 0; j < k; j++) {
                System.out.print(8);
            }
            System.out.println();
        }

    }
}
