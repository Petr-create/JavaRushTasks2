package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a < b && a > c) || a == b || a == c || (b < a && a < c)){
            System.out.println(a);
        } else if ((b < a && b > c) || b == a || b == c || (b < c && a < b)){
            System.out.println(b);
        } else if ((c < b && c > a) || c == b || c == a || (b < c && c < a)){
            System.out.println(c);
        } else {
            System.out.println(a);
        }
    }
}
