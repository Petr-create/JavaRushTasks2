package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

public class Solution {
    public static void main(String[] args) {
        try {
            System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        } catch (TooShortStringException e) {
            e.printStackTrace();
        }
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if(string == null){
            throw new TooShortStringException();
        }
        String[] str = string.split(" ");
        if(str.length < 5){
            throw new TooShortStringException();
        }
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i < 5; i++) {
            stringBuilder.append(str[i]);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
