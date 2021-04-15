package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(file1);

        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileOutputStream fileOutputStream2 = new FileOutputStream(file2);
        FileOutputStream fileOutputStream3 = new FileOutputStream(file3);

        int half = (fileInputStream.available() + 1) / 2;
        int count = 0;
        while (fileInputStream.available() > 0){
            if(count < half){
                fileOutputStream2.write(fileInputStream.read());
                count++;
            } else {
                fileOutputStream3.write(fileInputStream.read());
            }
        }

        fileInputStream.close();
        fileOutputStream2.close();
        fileOutputStream3.close();
    }
}
