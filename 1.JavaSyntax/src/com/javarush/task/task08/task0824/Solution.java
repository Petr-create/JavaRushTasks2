package com.javarush.task.task08.task0824;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Собираем семейство
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<Human> o = new ArrayList<>();
        Human human1 = new Human("сын Вася", true, 3, o);
        Human human2 = new Human("дочь Оля", false,5, o);
        Human human3 = new Human("сын Коля", true, 4, o);
        ArrayList<Human> child = new ArrayList<>();
        child.add(human1);
        child.add(human2);
        child.add(human3);
        Human f = new Human("папа Олег", true, 30, child);
        Human m = new Human("мама Лена", false, 30, child);
        ArrayList<Human> parent1 = new ArrayList<>();
        parent1.add(f);
        ArrayList<Human> parent2 = new ArrayList<>();
        parent2.add(m);
        Human gf1 = new Human("дед Андрей", true,60, parent1);
        Human gm1 = new Human("бабушка Марина", false,60, parent1);
        Human gf2 = new Human("дед Иван", true, 65,parent2);
        Human gm2 = new Human("бабушка Надя", false, 65, parent2);

        System.out.println(gf1);
        System.out.println(gm1);
        System.out.println(gf2);
        System.out.println(gm2);
        System.out.println(f);
        System.out.println(m);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
    }


    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
