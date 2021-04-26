package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Пунктуация
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = br.readLine();
            fileName2 = br.readLine();
        }

        try(BufferedReader bfReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileName2))){

            while(bfReader.ready()){
                String s = bfReader.readLine().replaceAll("\\p{P}", "");
                bfWriter.write(s);
            }
        }
    }
}
