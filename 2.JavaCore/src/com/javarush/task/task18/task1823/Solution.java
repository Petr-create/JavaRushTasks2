package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String fileName = reader.readLine();
            if(fileName.equals("exit")){
                return;
            }
            new ReadThread(fileName).start();
        }
    }

    public static class ReadThread extends Thread {
        private final String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }
        
        @Override
        public void run() {

            int[] array = new int[256];
            try(FileInputStream fileInputStream = new FileInputStream(fileName)) {
                while(fileInputStream.available() > 0){
                    int data = fileInputStream.read();
                    array[data]++;
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
            int max = Integer.MIN_VALUE;
            int bytes = 0;
            for (int i = 0; i < array.length; i++) {
                if(array[i] > max){
                    max = array[i];
                    bytes = i;
                }
            }
            resultMap.put(fileName, bytes);
            System.out.println(fileName + " " + bytes);

        }
    }
}
