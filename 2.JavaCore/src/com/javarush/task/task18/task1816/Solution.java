package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* 
Английские букв
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        FileReader fileReader = new FileReader(args[0]);
//        BufferedReader reader = new BufferedReader(fileReader);
//        int count = 0;
//        while (reader.ready()){
//            char c = (char)reader.read();
//            if(Character.toString(c).matches("[a-zA-Z]")){
//                count++;
//            }
//        }
        try(FileInputStream fileInputStream = new FileInputStream(args[0])) {
            int count = 0;
            while (fileInputStream.available() > 0) {
                char c = (char) fileInputStream.read();
                if (Character.toString(c).matches("[a-zA-Z]")) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
