package com.javarush.task.task20.task2020;

import java.io.*;
import java.util.logging.Logger;

/* 
Сериализация человека
*/

public class Solution {

    public static class Person implements Serializable{
        String firstName;
        String lastName;
        transient String fullName;
        transient final String greeting;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greeting = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }
    }

    enum Sex {
        MALE,
        FEMALE
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Person person = new Person("Вася", "Иванов", "Russia", Sex.MALE);
        File file = new File("TestFile");
        FileOutputStream out = new FileOutputStream(file);
        ObjectOutputStream outputStream = new ObjectOutputStream(out);
        outputStream.writeObject(person);
        out.close();
        outputStream.close();

        FileInputStream in = new FileInputStream(file);
        ObjectInputStream inputStream = new ObjectInputStream(in);
        Person p = (Person) inputStream.readObject();
        in.close();
        inputStream.close();

    }
}
