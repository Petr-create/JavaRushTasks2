package com.javarush.task.task05.task0513;

/* 
Собираем прямоугольник
*/

public class Rectangle {

    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }
    public void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }
    public void initialize(int top, int left, int widht){
        this.top = top;
        this.left = left;
        this.width = widht;
        height = widht;
    }

    public void initialize(Rectangle r){
        this.top = r.top;
        this.left = r.left;
        this.width = r.width;
        this.height = r.height;
    }



    public static void main(String[] args) {

    }
}
