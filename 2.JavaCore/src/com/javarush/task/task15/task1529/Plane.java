package com.javarush.task.task15.task1529;

public class Plane implements CanFly{
    int numPass;

    public Plane(int numPass) {
        this.numPass = numPass;
    }

    @Override
    public void fly() {
        System.out.println("plane fly");
    }
}
