package com.javarush.task.task18.task1826;

import java.io.*;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[1]);
        FileOutputStream fileOutputStream = new FileOutputStream(args[2]);
        int key = 5;
        while(fileInputStream.available() > 0){
            if(args[0].equals("-e")){
                fileOutputStream.write(fileInputStream.read() + key);
            }
            if(args[0].equals("-d")){
                fileOutputStream.write(fileInputStream.read() - key);
            }
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}

//    String mode = args[0];
//        if (!(mode.equals("-e") || mode.equals("-d"))) return;
//                try (FileInputStream fileInputStream = new FileInputStream(args[1]);
//                FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
//
//                if (mode.equals("-e")) {
//                while (fileInputStream.available() > 0) {
//                fileOutputStream.write(fileInputStream.read() + 32);
//                }
//                } else {
//                while (fileInputStream.available() > 0) {
//                fileOutputStream.write(fileInputStream.read() - 32);
//                }
//                }
//                }
