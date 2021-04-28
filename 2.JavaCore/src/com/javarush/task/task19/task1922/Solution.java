package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName;
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            fileName = reader.readLine();
        }

        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String str;
            while((str = reader.readLine()) != null){
                String[] array = str.split(" ");
                int count = 0;
                for (int i = 0; i < array.length; i++) {
                    for (String word : words) {
                        if (array[i].equals(word)) {
                            count++;
                        }
                    }
                }
                if(count == 2){
                    System.out.println(str);
                }
            }
        }
    }
}
//    int wordCount = 0;
//                for (String s : splitedReadedString) {
//                        if (words.contains(s)) {
//                        wordCount++;
//                        }
//                        }
