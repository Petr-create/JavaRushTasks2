package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReadNumbersCount extends Thread{
    @Override
    public void run() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        try {
            while(true){
                String s = reader.readLine();
                if(!s.equals("N")){
                    int x = Integer.parseInt(s);
                    list.add(x);
                }else {
                    break;
                }
            }
            int sum = 0;
            for (Integer i : list){
                sum += i;
            }
            System.out.println(sum);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
