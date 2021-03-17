package com.javarush.task.task09.task0921;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {

            InputStream inputStream = System.in;
            Reader reader = new InputStreamReader(inputStream);
            BufferedReader bf = new BufferedReader(reader);
            List<Integer> list = new ArrayList<>();

        while (true) {
            try {
                int x = Integer.parseInt(bf.readLine());
                list.add(x);
            } catch (NumberFormatException e) {
                break;
            } catch (IOException e){
                e.getStackTrace();
            }
        }
        for (Integer i : list) {
            System.out.println(i);
        }
    }
}

//try {
//        String string;
//        while (true) {
//        string = reader.readLine();
//        result.add(Integer.parseInt(string));
//        }
//        } catch (Exception e) {
//        for (Integer value : result) {
//        System.out.println(value);
//        }
//        }