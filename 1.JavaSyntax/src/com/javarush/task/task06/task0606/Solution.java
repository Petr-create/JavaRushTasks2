package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        Reader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);
        String number = bf.readLine();
        int num = Integer.parseInt(number);
        int saveNum = num;
        int count = 0;
        while(num > 0){
            num /= 10;
            count++;
        }
        int[] mas = new int[count];
        for (int i = 0; i < count; i++) {
            mas[i] = saveNum % 10;
            saveNum /= 10;
        }
        for (int i : mas) {
            if(i != 0) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        System.out.print("Even: " + even + " Odd: " + odd);

    }
}
