package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> map = new HashMap<>();
        map.put("Иванов", "Иван");
        map.put("Федоров", "Альберт");
        map.put("Соколов", "Олег");
        map.put("Неиванов", "Павел");
        map.put("Романов", "Виталий");
        map.put("Новиков", "Иван");
        map.put("Путин", "Андрей");
        map.put("Горбачев", "Иван");
        map.put("Иванович", "Сергей");
        map.put("Петров", "Олег");
        return map;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
       int count = 0;
       for(Map.Entry<String, String> pair : map.entrySet()){
           String value = pair.getValue();
           if(value.equals(name)){
              count++;
           }
       }
       return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count = 0;
        for(Map.Entry<String, String> pair : map.entrySet()){
            String key = pair.getKey();
            if(key.equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        int countName = getCountTheSameFirstName(map, "Иван");
        int countLastName = getCountTheSameLastName(map, "Иванов");
//        System.out.println(countName);
//        System.out.println(countLastName);
    }
}
