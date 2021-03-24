package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        InputStream stream = System.in;
//        InputStreamReader inputStreamReader = new InputStreamReader(stream);
//        BufferedReader br = new BufferedReader(inputStreamReader);
//
//        InputStream inputStream = new FileInputStream(br.readLine());
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//        OutputStream outputStream = new PrintStream(System.out);
//        while(bufferedInputStream.available() > 0){
//            int data = bufferedInputStream.read();
//            outputStream.write(data);
//        }
//        br.close();
//        bufferedInputStream.close();
//        outputStream.close();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(sourceFileName);

        Scanner scanner = new Scanner(fileInputStream);
        StringBuilder builder = new StringBuilder();

        while (scanner.hasNextLine()) {
            builder.append(scanner.nextLine()).append("\n");
        }

        System.out.print(builder.toString());
    }
}