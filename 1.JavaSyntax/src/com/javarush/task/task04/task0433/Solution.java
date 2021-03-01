package com.javarush.task.task04.task0433;

/* 
Гадание на долларовый счет
*/

public class Solution {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        while(j < 10) {
            while (i < 10) {
                System.out.print("S");
                i++;
            }
            j++;
            i = 0;
            System.out.println();
        }

    }
}
