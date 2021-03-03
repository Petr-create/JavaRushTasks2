package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Саша", 20, "Санкт-Петербург");
        Man man2 = new Man("Миша", 25,"Москва");
        System.out.println(man1);
        System.out.println(man2);
        Woman woman1 = new Woman("Люба", 53, "Кингисепп");
        Woman woman2 = new Woman("Вера", 70, "Всеволожск");
        System.out.println(woman1);
        System.out.println(woman2);
    }

    public static class Man{
        String name;
        int age;
        String address;

        public Man(String name){
            this.name = name;
        }
        public Man(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Man(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public String toString(){
            return name + " " + age + " " + address;
        }
    }
    public static class Woman{
        String name;
        int age;
        String address;
        public Woman(String name){
            this.name = name;
        }
        public Woman(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Woman(String name, int age, String address){
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString(){
            return name + " " + age + " " + address;
        }

    }
}
