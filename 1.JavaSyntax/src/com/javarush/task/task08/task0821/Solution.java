package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Федоров", "Альберт");
        map.put("Соколов", "Олег");
        map.put("Неиванов", "Павел");
        map.put("Романов", "Виталий");
        map.put("Новиков", "Иван");
        map.put("Путин", "Андрей");
        map.put("Горбачев", "Иван");
        map.put("Иванов", "Сергей");
        map.put("Петров", "Олег");
        return map;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
