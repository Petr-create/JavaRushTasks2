package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/* 
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream ps = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream);
        testString.printSomething();
        System.setOut(ps);
        String[] result = byteArrayOutputStream.toString().split("\n");

        int count = 0;
        for(String s : result){
            if(count == 2){
                System.out.println("JavaRush - курсы Java онлайн");
                count = 0;
            }
            System.out.println(s);
            count++;
        }

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
//    String[] byteArray = byteArrayOutputStream.toString().split("\\n");
//        for (int i = 0; i < byteArray.length; i++) {
//        System.out.println(byteArray[i]);
//        if (i % 2 != 0)
//            System.out.println("JavaRush - курсы Java онлайн");
//    }
}
