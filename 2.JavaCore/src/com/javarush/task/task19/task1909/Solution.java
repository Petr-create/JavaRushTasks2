package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1;
        String fileName2;

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = br.readLine();
            fileName2 = br.readLine();
        }

//        try(FileReader fileReader = new FileReader(fileName1);
//            FileWriter fileWriter = new FileWriter(fileName2)){
//            char ch;
//
//            while(fileReader.ready()){
//                ch = (char) fileReader.read();
//                if(ch == '.'){
//                    ch = '!';
//                }
//                fileWriter.write(ch);
//            }
//        }
        try(BufferedReader bfReader = new BufferedReader(new FileReader(fileName1));
            BufferedWriter bfWriter = new BufferedWriter(new FileWriter(fileName2))){

            StringBuilder stringBuilder = new StringBuilder();

            String string;
            while((string = bfReader.readLine()) != null){
                stringBuilder.append(string);
            }

            char[] ch = stringBuilder.toString().toCharArray();

            for(char c : ch){
                if(c == '.'){
                    c = '!';
                }
                bfWriter.write(c);
            }
        }
//        ArrayList<String> fileContent = new ArrayList<>();
//        try (BufferedReader inputFileReader = new BufferedReader(new FileReader(inputFileName))) {
//            while (inputFileReader.ready()) {
//                fileContent.add(inputFileReader.readLine());
//            }
//        }
//        try (BufferedWriter outputFileWriter = new BufferedWriter(new FileWriter(outputFileName))) {
//            for (String s : fileContent) {
//                outputFileWriter.write(s.replaceAll("\\.", "!"));
//            }
//        }
    }
}
