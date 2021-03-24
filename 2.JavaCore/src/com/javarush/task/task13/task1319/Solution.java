package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream stream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        FileWriter fileWriter = new FileWriter(reader.readLine());
        BufferedWriter writerFile = new BufferedWriter(fileWriter);
        String s;

        List<String> list = new ArrayList<>();

        while(true){
            s = reader.readLine();
            list.add(s);
            if(s.equals("exit")){
                break;
            }
        }

        for (int i = 0; i < list.size(); i++) {
            writerFile.write(list.get(i) + "\n");
        }
        reader.close();
        writerFile.close();
    }
}
