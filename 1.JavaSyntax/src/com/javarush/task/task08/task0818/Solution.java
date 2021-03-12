package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("Сидоров", 834);
        map.put("Петров", 50);
        map.put("Иванов", 1000);
        map.put("Бобков", 20);
        map.put("Федоров", 10);
        map.put("Путин", 780);
        map.put("Жабин", 1069);
        map.put("Ежов", 49);
        map.put("Ершов", 3000);
        map.put("Новиков", 990);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String, Integer> clone = new HashMap<>(map);
        for(Map.Entry<String, Integer> pair : clone.entrySet()){
            if(pair.getValue() < 500){
                map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = createMap();
        removeItemFromMap(map);
        //System.out.println(map);
    }
}