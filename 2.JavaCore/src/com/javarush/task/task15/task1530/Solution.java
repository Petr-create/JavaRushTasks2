package com.javarush.task.task15.task1530;

/* 
Template pattern
*/

public class Solution {
    public static void main(String[] args) {
        DrinkMaker latter = new LatteMaker();
        latter.makeDrink();
        DrinkMaker tea = new TeaMaker();
        tea.makeDrink();
    }
}
