package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
            if(fileScanner.hasNext()){
                String[] s = fileScanner.nextLine().split(" ");
                String firstName = s[1];
                String middleName = s[2];
                String lastName = s[0];
                String d = String.format("%s.%s.%s", s[3], s[4], s[5]);
                SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
                Date date = format.parse(d);
                return new Person(firstName, middleName,
                        lastName, date);
            }
            return null;
//            String str = fileScanner.nextLine();
//            String[] split = str.split(" ");
//
//            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4]) - 1, Integer.parseInt(split[3]));
//            Date date = calendar.getTime();
//            Person person = new Person(split[1], split[2], split[0], date);
//            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
