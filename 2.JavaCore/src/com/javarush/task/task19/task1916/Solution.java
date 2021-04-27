package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        String file1;
        String file2;

        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            file1 = reader.readLine();
            file2 = reader.readLine();
        }
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();

        try(BufferedReader readerFile1 = new BufferedReader(new FileReader(file1));
            BufferedReader readerFile2 = new BufferedReader(new FileReader(file2))){
            String str1;
            String str2;
            while((str1 = readerFile1.readLine()) != null){
                list1.add(str1);
            }
            while((str2 = readerFile2.readLine()) != null){
                list2.add(str2);
            }
        }

        int countLineFile1 = 0;
        int countLineFile2 = 0;

        while(countLineFile1 < list1.size() && countLineFile2 < list2.size()){
            if(list1.get(countLineFile1).equals(list2.get(countLineFile2))){
                lines.add(new LineItem(Type.SAME, list2.get(countLineFile2)));
                countLineFile1++;
                countLineFile2++;
            } else if (list1.get(countLineFile1).equals(list2.get(countLineFile2 + 1))){
                lines.add(new LineItem(Type.ADDED, list2.get(countLineFile2)));
                countLineFile2++;
            } else if (list1.get(countLineFile1 + 1).equals(list2.get(countLineFile2))) {
                lines.add(new LineItem(Type.REMOVED, list1.get(countLineFile1)));
                countLineFile1++;
            }
        }

        while(countLineFile1 < list1.size()){
            lines.add(new LineItem(Type.REMOVED, list1.get(countLineFile1)));
            countLineFile1++;
        }

        while(countLineFile2 < list2.size()){
            lines.add(new LineItem(Type.ADDED, list2.get(countLineFile2)));
            countLineFile2++;
        }

        for(LineItem  l : lines){
            System.out.println(l);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return type + " " + line;
        }
    }
}
///Users/petr/Downloads/JavaRushTasks/1.JavaSyntax/src/text1
///Users/petr/Downloads/JavaRushTasks/1.JavaSyntax/src/text2