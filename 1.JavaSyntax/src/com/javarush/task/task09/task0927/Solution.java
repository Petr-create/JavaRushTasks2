package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Васька", new Cat("Васька"));
        map.put("Малыш", new Cat("Малыш"));
        map.put("Барсик", new Cat("Барсик"));
        map.put("Шарик", new Cat("Шарик"));
        map.put("Бобик", new Cat("Бобик"));
        map.put("Рыжий", new Cat("Рыжий"));
        map.put("Матроскин", new Cat("Матроскин"));
        map.put("Ушастый", new Cat("Ушастый"));
        map.put("Усатый", new Cat("Усатый"));
        map.put("Хвостатый", new Cat("Хвостатый"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        Set<Cat> set = new HashSet<>();
        for(Map.Entry<String, Cat> pair : map.entrySet()){
            set.add(pair.getValue());
        }
        return set;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
