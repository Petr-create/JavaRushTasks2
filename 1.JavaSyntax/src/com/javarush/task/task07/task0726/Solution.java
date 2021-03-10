package com.javarush.task.task07.task0726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Не компилируется задача про котиков
*/

public class Solution {
    public final static ArrayList<Cat> CATS = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if (name == null || name.isEmpty()) {
                break;
            }
            String s1 = reader.readLine();
            if (s1 == null || s1.isEmpty()) {
                break;
            }
            int age = Integer.parseInt(s1);

            String s2 = reader.readLine();
            if (s2 == null || s2.isEmpty()) {
                break;
            }
            int weight = Integer.parseInt(s2);

            String s3 = reader.readLine();
            if (s3 == null || s3.isEmpty()) {
                break;
            }
            int tailLength = Integer.parseInt(s3);

            Cat cat = new Cat(name, age, weight, tailLength);
            CATS.add(cat);
        }

        printList();
    }

    public static void printList() {
        for (int i = 0; i < CATS.size(); i++) {
            System.out.println(CATS.get(i));
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat's name: " + name + ", age: " + age
                    + ", weight: " + weight + ", tail: " + tailLength;
        }
    }
}