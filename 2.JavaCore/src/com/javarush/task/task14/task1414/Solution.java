package com.javarush.task.task14.task1414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
MovieFactory
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key;
        Movie movie;
        while(true){
            key = reader.readLine();
            movie = MovieFactory.getMovie(key);
            if(movie != null){
                System.out.println(movie.getClass().getSimpleName());
            }
            if(!key.equals("cartoon") && !key.equals("thriller") && !key.equals("soapOpera")){
                break;
            }
        }

    }

    static class MovieFactory {

        static Movie getMovie(String key) {
            Movie movie = null;

            //создание объекта SoapOpera (мыльная опера) для ключа "soapOpera"
            if ("soapOpera".equals(key)) {
                movie = new SoapOpera();
            }

            if ("cartoon".equals(key)) {
                movie = new Cartoon();
            }

            if ("thriller".equals(key)){
                movie = new Thriller();
            }

            return movie;
        }
    }

    static abstract class Movie {
    }

    static class SoapOpera extends Movie {
    }

    static class Cartoon extends Movie{

    }

    static class Thriller extends Movie{

    }
}
//   String key = null;
//        while ((key = reader.readLine()) != null) {
//            Movie movie = MovieFactory.getMovie(key);
//            if (movie == null) {
//                return;
//            }
//            System.out.println(movie.getClass().getSimpleName());
//        }
