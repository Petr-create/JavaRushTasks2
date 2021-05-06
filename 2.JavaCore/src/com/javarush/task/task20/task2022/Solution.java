package com.javarush.task.task20.task2022;

import java.io.*;

/* 
Переопределение сериализации в потоке
*/

public class Solution implements Serializable, AutoCloseable {
    transient private FileOutputStream stream;
    private String fileName;

    public Solution(String fileName) throws FileNotFoundException {
        this.fileName = fileName;
        this.stream = new FileOutputStream(fileName);
    }

    public void writeObject(String string) throws IOException {
        stream.write(string.getBytes());
        stream.write("\n".getBytes());
        stream.flush();
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        stream = new FileOutputStream(fileName, true);
    }

    @Override
    public void close() throws Exception {
        System.out.println("Closing everything!");
        stream.close();
    }

    public static void main(String[] args) throws Exception {
        Solution solution = new Solution("TestFile1.txt");
        solution.writeObject("Привет МИР!!!");
        FileOutputStream str = new FileOutputStream("TestFile.txt");
        ObjectOutputStream out = new ObjectOutputStream(str);
        out.writeObject(solution);
        out.flush();
        out.close();
        str.close();

        FileInputStream stream = new FileInputStream("TestFile.txt");
        ObjectInputStream in = new ObjectInputStream(stream);
        Solution s = (Solution) in.readObject();
        in.close();
        stream.close();
        s.writeObject("Пока!");
    }
}
