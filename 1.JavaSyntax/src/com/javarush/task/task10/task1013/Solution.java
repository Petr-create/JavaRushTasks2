package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        private String name;
        private String lastName;
        private int age;
        private boolean sex;
        private int numberChildren;
        private boolean married;

        public Human(){}
        public Human(String name, String lastName, int age, boolean sex, int numberChildren, boolean married){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.numberChildren = numberChildren;
            this.married = married;
        }
        public Human(String name, String lastName, int age, boolean sex, int numberChildren){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
            this.numberChildren = numberChildren;
        }
        public Human(String name, String lastName, int age, boolean sex){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
            this.sex = sex;
        }
        public Human(String name, String lastName, int age){
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }
        public Human(String name, String lastName){
            this.name = name;
            this.lastName = lastName;
        }
        public Human(String name){
            this.name = name;
        }
        public Human(Human human){
            this.name = human.name;
        }
        public Human(int age, String lastName, String name){
            this.age = age;
            this.lastName = lastName;
            this.name = name;
        }
        public Human(String lastName, boolean sex){
            this.lastName = lastName;
            this.sex = sex;
        }
    }

}
