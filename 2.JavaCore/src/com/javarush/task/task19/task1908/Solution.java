package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = br.readLine();
            fileName2 = br.readLine();
        }

        try(BufferedReader bfReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileName2))) {
            StringBuilder stringBuilder = new StringBuilder();
            String s;
            while((s = bfReader.readLine()) != null){
                for (String q : s.split(" ")){
                    if(q.matches("\\d*")){
                        stringBuilder.append(q + " ");
                    }
                }
            }
            bfWriter.write(stringBuilder.toString());
        }
    }
}
//    String inputFileName;
//    String outputFileName;
//
//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
//                inputFileName = reader.readLine();
//                outputFileName = reader.readLine();
//                }
//
//                ArrayList<String> fileContent = new ArrayList<>();
//        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
//        while (inputFileReader.ready()) {
//        fileContent.add(inputFileReader.readLine());
//        }
//        }
//
//        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
//        for (String line : fileContent) {
//        String[] splitLine = line.trim().split(" ");
//        for (String word : splitLine) {
//        try {
//        int num = Integer.parseInt(word);
//        outputFileWriter.write(word + " ");
//        } catch (Exception ignore) {
//        /* NOP */
//        }
//        }
//        }
//        }
