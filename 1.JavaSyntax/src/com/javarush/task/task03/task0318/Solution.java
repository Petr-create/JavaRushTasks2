package com.javarush.task.task03.task0318;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.zip.InflaterInputStream;

/* 
План по захвату мира
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int years = Integer.parseInt(reader.readLine());
        String name = reader.readLine();

        System.out.print(name + " захватит мир через " + years + " лет. Му-ха-ха!");

    }
}
