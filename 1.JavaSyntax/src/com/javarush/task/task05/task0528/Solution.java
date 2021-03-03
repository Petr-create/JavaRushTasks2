package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/* 
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd MM yyyy");
        System.out.println(f.format(date));
    }
}
