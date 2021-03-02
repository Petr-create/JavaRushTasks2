package com.javarush.task.task05.task0502;

/* 
Реализовать метод fight
*/

public class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int countThis = 0;
        int countAnotherCat = 0;
        if(this.age > anotherCat.age){
            countThis++;
        } else if (this.age < anotherCat.age){
            countAnotherCat++;
        }
        if (this.weight > anotherCat.weight) {
            countThis++;
        } else if (this.weight < anotherCat.weight){
            countAnotherCat++;
        }
        if (this.strength > anotherCat.strength){
            countThis++;
        } else if (this.strength < anotherCat.strength){
            countAnotherCat++;
        }

        if(countThis > countAnotherCat){
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.age = 40;
        cat1.weight = 50;
        cat1.strength = 60;
        Cat cat2 = new Cat();
        cat2.age = 40;
        cat2.weight = 50;
        cat2.strength = 50;
        boolean q = cat1.fight(cat2);
        System.out.println(q);
    }
}
