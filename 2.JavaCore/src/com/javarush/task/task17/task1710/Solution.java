package com.javarush.task.task17.task1710;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if(args[0].equals("-c")){
            Person person;
            Date date = formatDate(args[3]);
            if(maleOrFemale(args[2])) {
                person = Person.createMale(args[1], date);
            } else {
                person = Person.createFemale(args[1], date);
            }
            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }

        if(args[0].equals("-u")){
            Person person;
            Date date = formatDate(args[4]);
            int index = Integer.parseInt(args[1]);
            if(maleOrFemale(args[3])) {
                person = Person.createMale(args[2], date);
            } else {
                person = Person.createFemale(args[2], date);
            }
            allPeople.set(index, person);
        }

        if(args[0].equals("-d")){
            int index = Integer.parseInt(args[1]);
            Person person = allPeople.get(index);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
            allPeople.set(index, person);
        }

        if(args[0].equals("-i")){
            int index = Integer.parseInt(args[1]);
            System.out.println(allPeople.get(index));
        }
        //System.out.println(allPeople);
    }

    public static Date formatDate(String d) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd/MM/yyyy");
        Date date = format.parse(d);
        return date;
    }

    public static boolean maleOrFemale(String s){
        return s.equals("м");
    }
}
//if (args == null || args.length < 1)
//        throw new RuntimeException();
//
//        Date birthdayDate = new Date();
//        Person person;
//        switch (args[0]) {
//        case "-c":
//        birthdayDate = simpleDateFormat.parse(args[3]);
//
//        if (args[2].equals("м"))
//        person = Person.createMale(args[1], birthdayDate);
//        else
//        person = Person.createFemale(args[1], birthdayDate);
//
//        allPeople.add(person);
//        System.out.println(allPeople.size() - 1);
//        break;
//        case "-u":
//        birthdayDate = simpleDateFormat.parse(args[4]);
//        int id = Integer.parseInt(args[1]);
//        person = allPeople.get(id);
//        if (person == null)
//        throw new IllegalArgumentException();
//        person.setSex(getSex(args[3]));
//        person.setBirthDate(birthdayDate);
//        person.setName(args[2]);
//        allPeople.set(id, person);
//        break;
//        case "-d":
//        Person currentPerson = allPeople.get(Integer.valueOf(args[1]));
//        currentPerson.setName(null);
//        currentPerson.setSex(null);
//        currentPerson.setBirthDate(null);
//        break;
//        case "-i":
//        person = allPeople.get(Integer.parseInt(args[1]));
//        if (person != null)
//        System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + simpleDateFormat2.format(person.getBirthDate()));
//        break;
//        }
