package com.javarush.task.task08.task0827;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) throws ParseException {
        System.out.println(isDateOdd("JANUARY 12 2021"));
    }
//MARCH
    public static boolean isDateOdd(String date) {
        Date start = new Date(date);
        Date end = new Date(date);
        start.setMonth(0);
        start.setDate(0);
        long x = (end.getTime() - start.getTime()) / (24 * 60 * 60 * 1000);
        System.out.println(x);
        if(x % 2 == 0){
            return false;
        }else {
            return true;
        }
    }
}
