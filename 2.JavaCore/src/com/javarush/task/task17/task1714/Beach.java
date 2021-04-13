package com.javarush.task.task17.task1714;

/* 
Comparable
*/

//import com.javarush.task.task15.task1526.Solution;

public class Beach implements Comparable<Beach>{
    private String name;      //название
    private float distance;   //расстояние
    private int quality;    //качество

    public Beach(String name, float distance, int quality) {
        this.name = name;
        this.distance = distance;
        this.quality = quality;
    }

    public synchronized String getName() {
        return name;
    }

    public synchronized void setName(String name) {
        this.name = name;
    }

    public synchronized float getDistance() {
        return distance;
    }

    public synchronized void setDistance(float distance) {
        this.distance = distance;
    }

    public synchronized int getQuality() {
        return quality;
    }

    public synchronized void setQuality(int quality) {
        this.quality = quality;
    }

    public static void main(String[] args) {
        Beach beach1 = new Beach("Хреновый", 5, 3);
        Beach beach2 = new Beach("Отличный", 25, 5);
        int x = beach1.compareTo(beach2);
        if (x > 0) {
            System.out.println("Лучший пляж: " + beach1.name);
        } else if (x < 0) {
            System.out.println("Лучший пляж: " + beach2.name);
        } else {
            System.out.println(beach1.name + " и " + beach2.name + " -  равны по качеству");
        }
    }

    @Override
    public synchronized int compareTo(Beach o) {
        int current = 0;
        int other = 0;
        float deltaDistance = distance - o.getDistance();
        if(deltaDistance > 0) {
            other++;
        } else if(deltaDistance < 0) {
            current++;
        }
        int deltaQuality = quality - o.getQuality();
        if(deltaQuality > 0) {
            current++;
        } else if(deltaQuality < 0) {
            other++;
        };
        return current - other;
    }
}
