package com.javarush.task.task04.task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Настя или Настя?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name1 = scanner.next();
        String name2 = scanner.next();
        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else {
            int countName1 = countName(name1);
            int countName2 = countName(name2);
            if (countName1 == countName2) {
                System.out.println("Длины имен равны");
            }
        }
    }

    public static int countName(String name) {
        int count = 0;
        for (int i = 0; i < name.length(); i++) {
            count++;
        }
        return count;
    }
}
