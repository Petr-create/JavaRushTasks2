package com.javarush.task.task16.task1630;

import java.io.*;
import java.util.Scanner;

/* 
Последовательный вывод файлов
*/

public class Solution {
    public static String firstFileName;
    public static String secondFileName;

    static {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            firstFileName = reader.readLine();
            secondFileName = reader.readLine();
        }catch(IOException e){
            e.getStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException, IOException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException, IOException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent() throws IOException;

        void join() throws InterruptedException;

        void start();
    }

    public static class ReadFileThread extends Thread implements ReadFileInterface{
        String fileNameRead;
        String s = "";

        @Override
        public void run() {
            Scanner scanner = null;
            try {
                scanner = new Scanner(new FileReader(fileNameRead));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while(scanner.hasNext()){
                s += scanner.nextLine() + " ";
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            fileNameRead = fullFileName;
        }

        @Override
        public String getFileContent() throws IOException {
//            FileReader readerFile = new FileReader(fileNameRead);
//            BufferedReader bf = new BufferedReader(readerFile);
//            String string;
//            String result = "";
//            while ((string = bf.readLine()) != null){
//                result += string + " ";
//            }
            return s;
        }
    }
}
