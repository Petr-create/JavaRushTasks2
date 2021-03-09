package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> arrayList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++) {
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        ArrayList<Integer> arrayList3 = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            int number = arrayList.get(i);
            if (number % 3 == 0 && number % 2 == 0) {
                arrayList1.add(number);
                arrayList2.add(number);
            } else if (number % 3 == 0) {
                arrayList1.add(number);
            } else if (number % 2 == 0) {
                arrayList2.add(number);
            } else {
                arrayList3.add(number);
            }
        }
        printList(arrayList1);
        printList(arrayList2);
        printList(arrayList3);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer i : list){
            System.out.println(i);
        }
    }

}
