package com.javarush.task.task04.task0425;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Цель установлена!
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if(x > 0 && y > 0)
            System.out.println(1);
        else if(x < 0 && y > 0)
            System.out.println(2);
        else if(x < 0 && y < 0)
            System.out.println(3);
        else
            System.out.println(4);
    }
}
