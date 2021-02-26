package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a + b > c && a + c > b && c + b > a){
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}