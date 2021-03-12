package com.javarush.task.task08.task0822;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        List<Integer> integerList = getIntegerList();
        System.out.println(getMinimum(integerList));
    }

    public static int getMinimum(List<Integer> array) {
        int min = Integer.MAX_VALUE ;
        for(Integer i : array){
            if(i < min){
                min = i;
            }
        }
        return min;
    }

    public static List<Integer> getIntegerList() throws IOException {
        List<Integer> list = new ArrayList<>();
        InputStream stream = System.in;
        Reader reader = new InputStreamReader(stream);
        BufferedReader bf = new BufferedReader(reader);
        int N = Integer.parseInt(bf.readLine());
        for (int i = 0; i < N; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
        return list;
    }
}
