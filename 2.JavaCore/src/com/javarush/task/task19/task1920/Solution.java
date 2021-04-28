package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> map = new TreeMap<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            while(reader.ready()){
                String[] str = reader.readLine().split(" ");
                if(map.containsKey(str[0])){
                    double sum = map.get(str[0]) + Double.parseDouble(str[1]);
                    map.put(str[0], sum);
                } else {
                    map.put(str[0], Double.parseDouble(str[1]));
                }
            }
        }
        double max = 0;
        for(Map.Entry<String, Double> pair : map.entrySet()){
            if(max < pair.getValue()){
                max = pair.getValue();
            }
        }

        for(Map.Entry<String, Double> pair : map.entrySet()){
            if(pair.getValue() == max){
                System.out.println(pair.getKey());
            }
        }
    }
}
