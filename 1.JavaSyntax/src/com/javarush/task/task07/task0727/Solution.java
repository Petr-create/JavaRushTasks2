package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        while (true) {
            String string = reader.readLine();
            if (string == null || string.isEmpty()){
                break;
            }
            strings.add(string);
        }

        ArrayList<String> resultStrings = new ArrayList<String>();
//        for (int i = 0; i < strings.size(); i++) {
//            String string = strings.get(i);
//            resultStrings.add(string.toUpperCase());
//        }
//        for (int i = 0; i < resultStrings.size(); i++) {
//            if(resultStrings.get(i).length() % 2 == 0){
//                resultStrings.add(i, resultStrings.get(i));
//                i += 1;
//            }
//            if(resultStrings.get(i).length() % 3 == 0){
//                resultStrings.add(i, resultStrings.get(i));
//                resultStrings.add(i, resultStrings.get(i));
//                i += 2;
//            }
//        }
        for (int i = 0; i < strings.size(); i++) {
            String string = strings.get(i);
            String result;
            if (string.length() % 2 == 0) {
                result = string + " " + string;
            } else {
                result = string + " " + string + " " + string;
            }
            resultStrings.add(result);
        }

        for (int i = 0; i < resultStrings.size(); i++) {
            System.out.println(resultStrings.get(i));
        }
    }
}
