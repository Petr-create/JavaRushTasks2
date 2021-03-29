package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(inputStreamReader);
        int x = 0;
        int y = 0;
             x = Integer.parseInt(bf.readLine());
             y = Integer.parseInt(bf.readLine());
             if(x < 1 || y < 1){
                 throw new IllegalArgumentException();
             }
        if(x == y){
            System.out.println(x);
            return;
        }
        int ost = 0;
        while(true) {
            if (x > y) {
                if (x % y == 0) {
                    System.out.println(y);
                    break;
                } else {
                    ost = x % y;
                    x = ost;
                }
            } else {
                if(y % x == 0){
                    System.out.println(x);
                    break;
                } else {
                    ost = y % x;
                    y = ost;
                }
            }
        }

    }
}
