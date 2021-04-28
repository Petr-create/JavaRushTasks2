package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while(reader.ready()){
                String[] str = reader.readLine().split(" ");
                if(map.containsKey(str[0])){
                    Double sum = map.get(str[0]) + Double.parseDouble(str[1]);
                    map.put(str[0], sum);
                } else {
                    map.put(str[0], Double.parseDouble(str[1]));
                }
            }
        }
        for(Map.Entry<String, Double> pair : map.entrySet()){
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }
}
