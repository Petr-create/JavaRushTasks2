package com.javarush.task.task08.task0817;

import java.util.HashMap;
import java.util.Map;

/* 
Нам повторы не нужны
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

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {
        Map<String, String> copy = new HashMap<>(map);
        int count = 0;
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            for(Map.Entry<String, String> pairMap : map.entrySet()){
                if(pair.getValue().equals(pairMap.getValue())){
                    count++;
                }
            }
            if(count > 1){
                removeItemFromMapByValue(map, pair.getValue());
            }
            count = 0;
        }
        //System.out.println(map);
    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {
        Map<String, String> copy = new HashMap<>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value)) {
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, String> map = createMap();
        removeTheFirstNameDuplicates(map);
    }
}
