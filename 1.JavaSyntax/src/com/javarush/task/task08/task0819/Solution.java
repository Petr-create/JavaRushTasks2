package com.javarush.task.task08.task0819;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();
//        cats.remove(cats.iterator().next());//правильное решение
//        Iterator<Cat> iterator = cats.iterator();
//        while(iterator.hasNext()){
//            Cat cat = iterator.next();
//            if(cat.name.equals("Хуиша")){
//                iterator.remove();
//            }
//        }
        Set<Cat> copy = new HashSet<>(cats);
        ArrayList<Integer> list = new ArrayList<>();
        for(Cat cat : cats){
            list.add(cat.hashCode());
        }
        for(Cat cat : copy){
            if(cat.hashCode() == list.get(1).hashCode()){
                cats.remove(cat);
            }
        }

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        Set<Cat> set = new HashSet<>();
//        Cat cat1 = new Cat("Шиша");
//        Cat cat2 = new Cat("Миша");
//        Cat cat3 = new Cat("Хуиша");
//        set.add(cat1);
//        set.add(cat2);
//        set.add(cat3);
        set.add(new Cat());
        set.add(new Cat());
        set.add(new Cat());
        return set;
    }

    public static void printCats(Set<Cat> cats) {
        for(Cat cat : cats){
            System.out.println(cat);
        }
    }

    public static class Cat{
//        private String name;
//        public Cat(String name){
//            this.name = name;
//        }
        public Cat(){}
//
//        public String getName() {
//            return name;
//        }

//        @Override
//        public String toString() {
//            return "Cat{" +
//                    "name='" + name + '\'' +
//                    '}';
//        }
    }
}
