package com.javarush.task.task18.task1817;

import java.io.*;

/* 
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(FileInputStream fileInputStream = new FileInputStream(args[0])) {
            int count1 = 0;
            int count2 = 0;
            while (fileInputStream.available() > 0) {
                char c = (char) fileInputStream.read();
                if (Character.toString(c).matches(".")) {
                    count1++;
                }
                if (Character.toString(c).matches(" ")){
                    count2++;
                }
            }
            System.out.println(count1);
            System.out.println(count2);
            double x = count2 / (double)count1 * 100;
            System.out.println(String.format("%.2f", x));
        }
        //во втором варианте количество символово в файле не совпадает с первым варианотом!!! ПОЧЕМУ???????

//        try(FileReader fileReader = new FileReader(args[0]);
//            BufferedReader reader = new BufferedReader(fileReader)) {
//            int count1 = 0;
//            int count2 = 0;
//            while (reader.ready()) {
//                char c = (char) reader.read();
//                if (Character.toString(c).matches(".")) {
//                    count1++;
//                }
//                if (Character.toString(c).matches(" ")) {
//                    count2++;
//                }
//            }
//            System.out.println(count1);
//            System.out.println(count2);
//            double x = count2 / (double)count1 * 100;
//            System.out.println(String.format("%.2f", x));
//        }
    }
}
