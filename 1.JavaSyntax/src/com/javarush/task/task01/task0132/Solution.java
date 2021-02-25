package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        int x = number % 10;
        int y = number / 100;
        int z = number / 10;
        int q = z % 10;

        return x + y + q;
    }
}