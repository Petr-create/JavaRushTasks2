package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = reader.readLine();
        }
        List<String > list = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while ((line = reader.readLine()) != null){
                list.add(line);
            }
        }
        for(String l : list){
            StringBuffer buffer = new StringBuffer();
            buffer.append(l);
            System.out.println(buffer.reverse());
        }
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//             BufferedReader fileIn = new BufferedReader(new FileReader(reader.readLine()))) {
//            while (fileIn.ready()) {
//                String line = fileIn.readLine();
//                System.out.println(new StringBuffer(line).reverse().toString());
//            }
//        } catch (IOException ignore) {
//            /* NOP */
//        }
    }
}
