package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Решаем пример
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(arrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        System.setOut(printStream);
        String[] str = arrayOutputStream.toString().split(" ");
        int firstNum = Integer.parseInt(str[0]);
        int secondNum = Integer.parseInt(str[2]);
        int arithmeticResult;

        if (str[1].trim().equals("+"))
            arithmeticResult = firstNum + secondNum;
        else if (str[1].trim().equals("-"))
            arithmeticResult = firstNum - secondNum;
        else
            arithmeticResult = firstNum * secondNum;

        System.out.println(firstNum + " " + str[1] + " " + secondNum + " = " + arithmeticResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }

    }
}

