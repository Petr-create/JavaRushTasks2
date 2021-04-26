package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.FileVisitResult;

/* 
Считаем слово
*/

public class Solution {
    private static int counter = 0;
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        FileReader fileReader = new FileReader(fileName);
//        BufferedReader readerFile = new BufferedReader(fileReader);
//        String line;
//        int count = 0;
//        while ((line = readerFile.readLine()) != null){
//            String[] s = line.split("\\W");
//            for(String q : s){
//                if(q.trim().equals("world")){
//                    count++;
//                }
//            }
//        }
//        System.out.println(count);
//        reader.close();
//        fileReader.close();
//        readerFile.close();
        String fileName;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = br.readLine();
        }

        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(fileName)) {
            char currentChar;
            while (reader.ready()) {
                currentChar = (char) reader.read();
                text.append(currentChar);

            }
        }

        String replacedString = text.toString()
                .replaceAll("\\p{P}", " ").replaceAll("\\s", " ");

        for (String x : replacedString.split(" ")) {
            if (x.equals("world")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
