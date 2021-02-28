package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int[] array = new int[3];
        array[0] = a;
        array[1] = b;
        array[2] = c;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0 && array[i] != 0){
                count1++;
            }else if(array[i] < 0 && array[i] != 0){
                count2++;
            }
        }
        System.out.println("количество отрицательных чисел: " + count2);
        System.out.println("количество положительных чисел: " + count1);
    }
}
