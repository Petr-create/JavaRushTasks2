package com.javarush.task.task03.task0314;

/* 
Таблица умножения Ӏ Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {

    public static void main(String[] args) {
        int k = 0;
        for(int i = 0; i < 10; i++){
            k++;
            int t=0;
            for(int j = 0; j < 10; j++){
                t = t + k;
                System.out.print(t + " "); //если поставить "/t" вместо будет красивее!
            }
            System.out.println();

        }
    }
}
