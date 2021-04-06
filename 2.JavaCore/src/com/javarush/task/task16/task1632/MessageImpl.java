package com.javarush.task.task16.task1632;

public class MessageImpl extends Thread implements Message{
    @Override
    public void showWarning() {
        this.interrupt();
    }

    @Override
    public void run() {
        while (!interrupted()){

        }
    }

//    boolean repeat = true;
//
//    @Override
//    public void showWarning() {
//        repeat = false;
//    }
//
//    @Override
//    public void run() {
//        while (repeat);
//    }
}
