package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if(isVowel(ch[i]) && ch[i] != ' '){
                System.out.print(ch[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < ch.length; i++) {
            if(!isVowel(ch[i]) && ch[i] != ' '){
                System.out.print(ch[i] + " ");
            }
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        // приводим символ в нижний регистр - от заглавных к строчным буквам
        for (char vowel : vowels) {
            // ищем среди массива гласных
            if (character == vowel) {
                return true;
            }
        }
        return false;
    }
}
//    StringBuffer buffer1 = new StringBuffer();
//    StringBuffer buffer2 = new StringBuffer();
//        for (char character : string.toCharArray()) {
//                if (isVowel(character)) {
//                buffer1.append(character).append(" ");
//                } else if (character != ' ') {
//                buffer2.append(character).append(" ");
//                }
//                }
//
//                System.out.println(buffer1);
//                System.out.println(buffer2);