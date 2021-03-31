package com.javarush.task.task09.task0930;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/* 
Задача по алгоритмам Ӏ Java Syntax: 9 уровень, 11 лекция
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        String line = reader.readLine();
        while (!line.isEmpty()) {
            list.add(line);
            line = reader.readLine();
        }

        String[] array = list.toArray(new String[0]);
        sort(array);

        System.out.println();
        for (String x : array) {
            System.out.println(x);
        }
    }

    public static void sort(String[] array) {
        List<Integer> number = new ArrayList<>();
        List<String> string = new ArrayList<>();
        for(String a : array){
            if(isNumber(a)){
                number.add(Integer.parseInt(a));
            } else {
                string.add(a);
            }
        }

        for (int i = 0; i < string.size(); i++) {
            for (int j = 0; j < string.size() - 1; j++) {
                if(isGreaterThan(string.get(j), string.get(j + 1))){
                    String temp = string.get(j + 1);
                    string.set(j + 1, string.get(j));
                    string.set(j, temp);
                }
            }
        }
//        for (String s : string){
//            System.out.println(s);
//        }

        Collections.sort(number);
        Collections.reverse(number);
        int numberIndex = 0;
        int stringIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if(isNumber(array[i])){
                array[i] = number.get(numberIndex).toString();
                numberIndex++;
            }else{
                array[i] = string.get(stringIndex);
                stringIndex++;
            }
        }
   }

    // Метод для сравнения строк: 'а' больше чем 'b'
    public static boolean isGreaterThan(String a, String b) {
        return a.compareTo(b) > 0;
    }


    // Переданная строка - это число?
    public static boolean isNumber(String text) {
        if (text.length() == 0) {
            return false;
        }

        char[] chars = text.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = chars[i];

            // есть '-' внутри строки
            if (i != 0 && character == '-') {
                return false;
            }

            // не цифра и не начинается с '-'
            if (!Character.isDigit(character) && character != '-') {
                return false;
            }

            // одиночный '-'
            if (chars.length == 1 && character == '-') {
                return false;
            }
        }

        return true;
    }
}
