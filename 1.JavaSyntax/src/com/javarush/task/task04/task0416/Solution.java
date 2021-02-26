package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/* 
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        InputStream stream = System.in;
        Reader reader = new InputStreamReader(stream);
        BufferedReader bf = new BufferedReader(reader);
        String n = bf.readLine();
        double t = Double.parseDouble(n);
//        for (int i = 0; i < (24 * 60); i += 5) {
//            if (t >= i && t < (i + 3)){
//                System.out.println("зелёный");
//                return;
//            } else if (t < (i + 4)){
//                System.out.println("жёлтый");
//                return;
//            } else if (t < (i + 5)){
//                System.out.println("красный");
//                return;
//            }
//        }
        //не прошел валидацию!!!!!! ПОЧЕМУ????
        if (t % 5 >= 0 && t % 5 < 3){
            System.out.println("зелёный");
        } else if (t % 5 < 4){
            System.out.println("жёлтый");
        } else if (t % 5 < 5){
            System.out.println("красный");
        }
    }
}
