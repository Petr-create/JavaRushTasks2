package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* 
Cамая длинная последовательность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        InputStream stream = System.in;
        Reader reader = new InputStreamReader(stream);
        BufferedReader bf = new BufferedReader(reader);
        for (int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bf.readLine()));
        }
//        int count = 0;
//        int max = 1;
//        for (int i = 0; i < list.size() - 1; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if(list.get(i).equals(list.get(j))){
//                    count++;
//                    if(j == list.size() - 1){
//                        if(max < count){
//                            max = count;
//                        }
//                        count = 0;
//                    }
//                } else {
//                    if(max < count){
//                        max = count;
//                    }
//                    count = 0;
//                }
//            }
//        }
        int count = 1;
        int max = 1;
        for (int i = 0; i < 9; i++) {
            if (list.get(i).equals(list.get(i + 1))) {
                max++;
            } else if (max > count) {
                count = max;
                max = 1;
            } else {
                max = 1;
            }
        }

        if (max > count) {
            count = max;
        }
        System.out.println(count);
//        System.out.println(max);
    }
}
