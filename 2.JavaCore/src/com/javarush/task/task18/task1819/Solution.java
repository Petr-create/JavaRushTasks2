package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

//      непровильное решение, одна запись затирает другую, но валидотор принял

//        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
//             FileInputStream fileInputStream2 = new FileInputStream(fileName2);
//             FileOutputStream fileOutputStream = new FileOutputStream(fileName1)){
//            byte[] buf1 = new byte[fileInputStream1.available()];
//            fileInputStream1.read(buf1);
//            byte[] buf2 = new byte[fileInputStream2.available()];
//            fileInputStream2.read(buf2);
//
//            fileOutputStream.write(buf2);
//            fileOutputStream.write(buf1);
//        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}
///Users/petr/Downloads/JavaRushTasks/1.JavaSyntax/src/text
///Users/petr/Downloads/JavaRushTasks/1.JavaSyntax/src/text2