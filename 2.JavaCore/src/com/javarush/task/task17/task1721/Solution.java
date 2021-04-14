package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);
        String fileName1 = null;
        String fileName2 = null;

        try{
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();

            BufferedReader bufRead1 = new BufferedReader(new FileReader(fileName1));
            String input;
            while((input = bufRead1.readLine()) != null){
                allLines.add(input);
            }
            bufRead1.close();

            BufferedReader bufRead2 = new BufferedReader(new FileReader(fileName2));
            while ((input = bufRead2.readLine()) != null){
                forRemoveLines.add(input);
            }
            bufRead2.close();
            new Solution().joinData();
        }catch(Exception e){

        }
    }

    public void joinData()throws CorruptedDataException {
        if(allLines.containsAll(forRemoveLines)){
            allLines.removeAll(forRemoveLines);
        } else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}
