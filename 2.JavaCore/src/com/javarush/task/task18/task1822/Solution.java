package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
         BufferedReader bfreader = new BufferedReader(new InputStreamReader(System.in));
         String fileName = bfreader.readLine();
         try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
             while(reader.ready()){
                 String[] s = reader.readLine().split(" ");
                 if(Integer.parseInt(s[0]) == Integer.parseInt(args[0])){
                     for(String i : s){
                         System.out.print(i + " ");
                     }
                     break;
                 }
             }
         }
//        String str;
//        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(reader.readLine()))) {
//            while ((str = bufferedFileReader.readLine()) != null) {
//                if (str.startsWith(args[0] + " ")) {
//                    System.out.println(str);
//                    break;
//                }
//            }
//        }
    }
}

