package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1 = args[0];
        String fileName2 = args[1];

        Charset win = Charset.forName("Windows-1251");
        Charset utf = StandardCharsets.UTF_8;

        FileInputStream  fileInputStream = new FileInputStream(fileName1);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        byte[] buf = new byte[bufferedInputStream.available()];
        while(bufferedInputStream.available() > 0){
            bufferedInputStream.read(buf);
        }
        String s = new String(buf, win);
        buf = s.getBytes(utf);

        FileOutputStream fileOutputStream = new FileOutputStream(fileName2);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        bufferedOutputStream.write(buf);

        bufferedInputStream.close();
        bufferedOutputStream.close();

//        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "Windows-1251"));
//             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(args[1]), StandardCharsets.UTF_8))) {
//
//            String s;
//            while ((s = reader.readLine()) != null) {
//                writer.write(s + "\n");
//            }
//        }
    }
}
