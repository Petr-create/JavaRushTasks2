package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String[] d = url.split("\\?");
        String[] params = d[1].split("&");
        Map<String,String> map = new LinkedHashMap<>();
        for(String w : params){
            if(w.contains("=")){
                String[] j = w.split("=");
                map.put(j[0], j[1]);
            } else {
                map.put(w, null);
            }
        }
        for(Map.Entry<String, String> pair : map.entrySet()){
            System.out.print(pair.getKey() + " ");
        }
//        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
//        while (iter.hasNext()){
//            Map.Entry<String, String> pair = iter.next();
//            System.out.print(pair.getKey() + " ");
//        }
        System.out.println();
        for(Map.Entry<String, String> pair : map.entrySet()){
            if(pair.getKey().equals("obj")) {
                try {
                    alert(Double.parseDouble(pair.getValue()));
                } catch (Exception e) {
                    alert(pair.getValue());
                }
            }
        }
    }

    public static void alert(double value) {
        System.out.println("double: " + value);
    }

    public static void alert(String value) {
        System.out.println("String: " + value);
    }
}
