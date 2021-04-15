package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String file1 = reader.readLine();
//        String file2 = reader.readLine();
//        FileInputStream fileInputStream = new FileInputStream(file1);
//        FileOutputStream fileOutputStream = new FileOutputStream(file2);
//
//        byte[] arrays = new byte[fileInputStream.available()];
//        fileInputStream.read(arrays);
//        for (int i = 0; i < arrays.length; i++) {
//            int j = arrays.length - i - 1;
//            fileOutputStream.write(arrays[j]);
//        }
//
//        fileInputStream.close();
//        fileOutputStream.close();
//    }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputFile = reader.readLine();
        String outputFile = reader.readLine();

        try (FileInputStream fileInputStream = new FileInputStream(inputFile);
             FileOutputStream fileOutputStream = new FileOutputStream(outputFile)) {

            List<Integer> inputBytes = new ArrayList<>();
            while (fileInputStream.available() > 0) {
                inputBytes.add(fileInputStream.read());
            }
            Collections.reverse(inputBytes);
            for (Integer aByte : inputBytes) {
                fileOutputStream.write(aByte);
            }
        }
    }
}
