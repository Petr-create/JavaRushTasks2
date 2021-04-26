package com.javarush.task.task19.task1915;

import java.io.*;

/* 
Дублируем текст
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        PrintStream printStream = System.out;
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(arrayOutputStream);
        System.setOut(stream);
        testString.printSomething();
        String str = arrayOutputStream.toString();
        FileOutputStream fileOutputStream = new FileOutputStream(nameFile);
        fileOutputStream.write(arrayOutputStream.toByteArray());
        System.setOut(printStream);
        System.out.println(str);
        fileOutputStream.close();
        reader.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

