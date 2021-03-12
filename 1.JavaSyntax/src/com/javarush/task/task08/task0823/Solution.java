package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        //------------------------------------------
        //работает только с лат буквами
//        Pattern pattern = Pattern.compile("\\w+");
//        Matcher matcher = pattern.matcher(string);
//        String str = "";
//        while (matcher.find()) {
//            str += matcher.group().substring(0, 1).toUpperCase() + matcher.group().substring(1) + " ";
//        }
//        System.out.println(str);
        //------------------------------------------

//        StringTokenizer tokenizer = new StringTokenizer(string);
//        String str = "";
//        while(tokenizer.hasMoreTokens()) {
//            String s = tokenizer.nextToken();
//            str += s.substring(0,1).toUpperCase() + s.substring(1) + " ";
//        }
//        System.out.println(str);

        String result = "";
        char[] chars = string.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char character = (i == 0 || chars[i - 1] == ' ') ? Character.toUpperCase(chars[i])
                    : chars[i];
            result += character;
        }
        System.out.println(result);
    }
}
