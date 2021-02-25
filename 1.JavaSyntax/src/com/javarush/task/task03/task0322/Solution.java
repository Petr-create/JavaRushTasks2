package com.javarush.task.task03.task0322;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Большая и чистая
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream stream = System.in;
        Reader reader = new InputStreamReader(stream);
        BufferedReader bf = new BufferedReader(reader);

        String name1 = bf.readLine();
        String name2 = bf.readLine();
        String name3 = bf.readLine();

        System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");

    }
}