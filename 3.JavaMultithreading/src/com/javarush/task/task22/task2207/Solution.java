package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/* 
Обращенные слова
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();
    public static List<String> listString = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        InputStream stream = System.in;
        Reader reader = new InputStreamReader(stream);
        BufferedReader read = new BufferedReader(reader);
        FileReader fileReader = new FileReader(read.readLine());
        BufferedReader readerFile = new BufferedReader(fileReader);
        Scanner scanner = new Scanner(readerFile);
        while(scanner.hasNext()){
            String s = scanner.next();
            listString.add(s);
        }
//        while (readerFile.ready()) {
//            listString.addAll(Arrays.asList(readerFile.readLine().split(" ")));
//        }

        for (int i = 0; i < listString.size(); i++) {
            for (int j = 0; j < listString.size(); ) {
                if (i >= listString.size()) {
                    break;
                }
                if (listString.get(j).equals(new StringBuilder(listString.get(i)).reverse().toString()) && j != i) {
                    Pair pair = new Pair();
                    pair.first = listString.get(j);
                    pair.second = listString.get(i);
                    result.add(pair);
                    listString.remove(j);
                    listString.remove(i);
                    j = 0;
                } else
                    j++;
            }
        }
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }
    }

}
