package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] a = new int[5];
        int[] b = new int[2];
        int[] c = new int[4];
        int[] d = new int[7];
        int[] e = new int[0];
        fullArray(a);
        fullArray(b);
        fullArray(c);
        fullArray(d);
        fullArray(e);
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }

    public static void fullArray(int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;//[1, 10]
        }
    }
}
