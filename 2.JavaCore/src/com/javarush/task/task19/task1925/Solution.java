package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){

            String line;
            int count = 0;
            while((line = reader.readLine()) != null){
                String[] str = line.split(" ");
                for(String s : str){
                    if(s.length() > 6){
                        if(count == 0){
                            writer.write(s);
                            count++;
                        } else {
                            writer.write("," + s);
                        }
                    }
                }
            }
        }

    }
//    String fileName1 = args[0];
//    String fileName2 = args[1];
//    String input;
//
//    ArrayList<String> fileContent = new ArrayList<String>();
//
//        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
//        while ((input = fileReader.readLine()) != null)
//            fileContent.add(input);
//    } catch (IOException ignore) {
//        /* NOP */
//    }
//
//    StringBuffer sbLine = new StringBuffer();
//        for (String line : fileContent) {
//        String[] splitedLine = line.split(" ");
//        for (String word : splitedLine) {
//            if (word.length() > 6)
//
//                sbLine.append(word).append(" ");
//        }
//    }
//
//    String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
//        try (FileWriter fileWriter = new FileWriter(fileName2)) {
//        fileWriter.write(resultLine);
//    } catch (IOException ignore) {
//        /* NOP */
//    }

}
