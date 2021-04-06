package com.javarush.task.task16.task1632;

public class ThrowAnException extends Thread{
    @Override
    public void run() {
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");;
        }
    }
}
