package com.javarush.task.task04.task0410;

/* 
Попадём-не-попадём
*/

public class Solution {
    public static void main(String[] args) {
        checkInterval(60);
        checkInterval(112);
        checkInterval(10);
    }

    public static void checkInterval(int number) {
        int f = abs(number);
        int x = f - 100;
        int y = f - 50;

        if (x > 0)
            System.out.println("Число " + number + " не содержится в интервале.");
        else if (y < 0)
            System.out.println("Число " + number + " не содержится в интервале.");
        else
            System.out.println("Число " + number + " содержится в интервале.");
    }

    public static int abs(int q){
        if(q<0)
            return -q;
        else
            return q;
    }
}