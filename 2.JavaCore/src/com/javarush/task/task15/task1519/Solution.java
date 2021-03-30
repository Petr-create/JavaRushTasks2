package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
           String o = reader.readLine();
           if(o.equals("exit")){
               break;
           }
           try {
               if (o.contains(".")){
                   Double value = Double.parseDouble(o);
                   print(value);
               } else {
                   int i = Integer.parseInt(o);
                   if (i > 0 && i < 128){
                       print(Short.parseShort(o));
                   } else {
                       print(i);
                   }
               }
           } catch (Exception e){
               print(o);
           }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
