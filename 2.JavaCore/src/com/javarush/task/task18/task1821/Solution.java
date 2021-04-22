package com.javarush.task.task18.task1821;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> map = new HashMap<>();

        try(FileInputStream fileInputStream = new FileInputStream(args[0])) {
            while (fileInputStream.available() > 0) {
                char c = (char) fileInputStream.read();
//          перенос строки и пробел тоже символы и их нужно посчитать
//                if (c == ' ' || c == '\n'){
//                    continue;
//                }
                if(map.containsKey(c)){
                    int val = map.get(c);
                    map.put(c, ++val);
                } else {
                    map.put(c, 1);
                }
            }
        }
        List<Character> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for(Character ch : list){
            System.out.println(ch + " " + map.get(ch));
        }
    }
}
//    int[] aSCII = new int[128];
//        try (FileReader reader = new FileReader(args[0])) {
//                while (reader.ready()) {
//                aSCII[reader.read()]++;
//                }
//                }
//                for (int i = 0; i < aSCII.length; i++) {
//        if (aSCII[i] != 0) {
//        System.out.println((char) i + " " + aSCII[i]);
//        }
//        }