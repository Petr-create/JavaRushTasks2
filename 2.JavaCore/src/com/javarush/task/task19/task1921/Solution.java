package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))){
            String str;
            while ((str = reader.readLine()) != null){
                String[] string = str.split(" ");
                int year = Integer.parseInt(string[string.length - 1]);
                int month = Integer.parseInt(string[string.length - 2]) - 1; //January == 0.
                int day = Integer.parseInt(string[string.length - 3]);
                Calendar birthDay = new GregorianCalendar(year, month, day);
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < string.length - 3; i++) {
                    stringBuilder.append(string[i] + " ") ;
                }
                PEOPLE.add(new Person(stringBuilder.toString().trim(), birthDay.getTime()));
            }
        }
        for(Person p : PEOPLE){
            System.out.println(p);
        }
    }
}
