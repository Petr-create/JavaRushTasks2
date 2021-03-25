package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen1 = HenFactory.getHen(Country.RUSSIA);
        Hen hen2 = HenFactory.getHen(Country.UKRAINE);
        Hen hen3 = HenFactory.getHen(Country.MOLDOVA);
        Hen hen4 = HenFactory.getHen(Country.BELARUS);
        System.out.println(hen1.getCountOfEggsPerMonth());
        System.out.println(hen2.getCountOfEggsPerMonth());
        System.out.println(hen3.getCountOfEggsPerMonth());
        System.out.println(hen4.getCountOfEggsPerMonth());

    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            if(country.equals("Russia")){
                return new RussianHen();
            }
            if(country.equals("Ukraine")){
                return new UkrainianHen();
            }
            if(country.equals("Moldova")){
                return new MoldovanHen();
            }
            if(country.equals("Belarus")){
                return new BelarusianHen();
            }
            return hen;
        }
    }

}
