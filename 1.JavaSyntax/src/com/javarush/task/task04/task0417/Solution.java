package com.javarush.task.task04.task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Существует ли пара?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (x == y && z == x){
            System.out.println(x + " " + y + " " + z);
        } else if (x == y) {
            System.out.println(x + " " + y);
        } else if (x == z) {
            System.out.println(x + " " + z);
        } else if (y == z){
            System.out.println(y + " " + z);
        }
    }
}