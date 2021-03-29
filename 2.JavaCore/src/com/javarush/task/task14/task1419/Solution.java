package com.javarush.task.task14.task1419;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //the first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        int[] array = new int[2];
        try {
            System.out.println(array[2]);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            FileInputStream fileInputStream = new FileInputStream("c:/text.txt");

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Integer.parseInt(null);

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            Double.parseDouble(null);

        } catch (Exception e) {
            exceptions.add(e);
        }

        Object szStr[] = new String[10];

        try {
            szStr[0] = new Character('*');
        } catch(Exception e) {
            exceptions.add(e);
        }

        Object ch = new Character('*');

        try {
            System.out.println((Byte)ch);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            int[] nNegArray = new int[-5];
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        String szShortString = "123";

        try {
            char chr = szShortString.charAt(10);
        }
        catch(Exception e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException("ха-ха");
        }catch (Exception e){
            exceptions.add(e);
        }
    }
}
