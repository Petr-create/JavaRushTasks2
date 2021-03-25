package com.javarush.task.task13.task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream stream = System.in;
        InputStreamReader inputStreamReader = new InputStreamReader(stream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

//        FileReader fileReader = new FileReader(reader.readLine());
//        BufferedReader bufferedReader = new BufferedReader(fileReader);
//        List<Integer> list = new ArrayList<>();
//        Scanner scanner = new Scanner(bufferedReader);
//        while(scanner.hasNextLine()){
//            int x = Integer.parseInt(scanner.nextLine());
//            list.add(x);
//        }
//        Collections.sort(list);
//        for(Integer i : list){
//            if(i % 2 == 0){
//                System.out.println(i);
//            }
//        }

        InputStream inputStream = new FileInputStream(reader.readLine());
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(bufferedInputStream);
        while(scanner.hasNextLine()){
            int x = Integer.parseInt(scanner.nextLine());
            list.add(x);
        }
        Collections.sort(list);
        for(Integer i : list) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        bufferedInputStream.close();
    }
}
