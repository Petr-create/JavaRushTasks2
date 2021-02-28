package com.javarush.task.task04.task0428;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Положительное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int[] array = new int[3];
        array[0] = number1;
        array[1] = number2;
        array[2] = number3;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > 0 && array[i] != 0){
                count++;
            }
        }
        System.out.println(count);
    }
}
