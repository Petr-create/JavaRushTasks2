package com.javarush.task.task16.task1632;

public class ShowUra extends Thread{
    @Override
    public void run() {
        try {
            while (true){
                System.out.println("Ура");
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
