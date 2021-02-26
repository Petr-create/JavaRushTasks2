package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if((year % 400) == 0){
            System.out.println("количество дней в году: 366");
        }else if((year % 100) == 0){
            System.out.println("количество дней в году: 365");
        }else if((year % 4) == 0){
            System.out.println("количество дней в году: 366");
        }else{
            System.out.println("количество дней в году: 365");
        }

    }
}