package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());
        Map<Integer,Integer> map = new HashMap<>();

        while (fileInputStream.available() > 0){
            int data = fileInputStream.read();
            if(map.containsKey(data)){
                int value = map.get(data);
                value++;
                map.put(data, value);
            } else {
                map.put(data, 1);
            }
        }

//        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
//            System.out.println(pair.getKey() + " : " + pair.getValue());
//        }
        int min = Integer.MAX_VALUE;

        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            if(min > pair.getValue()){
                min = pair.getValue();
            }
        }

        for(Map.Entry<Integer, Integer> pair : map.entrySet()){
            if(pair.getValue() == min){
                System.out.print(pair.getKey() + " ");
            }
        }
        fileInputStream.close();
    }
}
