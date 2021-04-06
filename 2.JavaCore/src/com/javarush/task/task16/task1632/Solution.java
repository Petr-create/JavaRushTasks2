package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);
    static {
        threads.add(new RunInfinitely());
        threads.add(new ThrowAnException());
        threads.add(new ShowUra());
        threads.add(new MessageImpl());
        threads.add(new ReadNumbersCount());
    }

    public static void main(String[] args) {
        for (Thread thread : threads){
            thread.start();
        }
    }
}