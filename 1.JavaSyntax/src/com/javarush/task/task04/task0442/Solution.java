package com.javarush.task.task04.task0442;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (true){
            int x = scanner.nextInt();
            if(x != -1){
                sum += x;
            } else {
                sum += x;
                break;
            }
        }
        System.out.println(sum);
    }
}
