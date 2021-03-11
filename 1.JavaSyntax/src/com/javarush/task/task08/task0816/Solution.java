package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Новиков", dateFormat.parse("JUN 1 2012"));
        map.put("Путин", dateFormat.parse("JUL 1 2012"));
        map.put("Ельцын", dateFormat.parse("AUG 1 2012"));
        map.put("Иванов", dateFormat.parse("OCT 1 2012"));
        map.put("Петров", dateFormat.parse("NOV 1 2012"));
        map.put("Сидоров", dateFormat.parse("FEB 1 2012"));
        map.put("Жуков", dateFormat.parse("MAR 1 2012"));
        map.put("Романов", dateFormat.parse("SEP 1 2012"));
        map.put("Сновиков", dateFormat.parse("SEP 1 2012"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            if(pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8){
                iterator.remove();
            }
        }
//        for(Map.Entry<String, Date> pair : map.entrySet()){
//            System.out.println(pair.getValue());
//        }
        //System.out.println(Arrays.asList(mapCopy.entrySet()));
    }

    public static void main(String[] args) throws ParseException {
        Map<String, Date> map = createMap();
        removeAllSummerPeople(map);
    }
}
