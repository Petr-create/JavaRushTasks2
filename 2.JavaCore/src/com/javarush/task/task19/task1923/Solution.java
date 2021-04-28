package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))){
            String str;
            while((str = reader.readLine()) != null){
                String[] string = str.split(" ");
                for(String s : string){
                    if(s.matches(".*\\d+.*")){
                        writer.write(s + " ");
                    }
                }
            }
        }
    }
}
