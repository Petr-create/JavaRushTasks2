package com.javarush.task.task17.task1721;

import java.io.IOException;

public class CorruptedDataException extends IOException {
    public CorruptedDataException(){
        System.out.println("в конструкторе исключения CorruptedDataException!!");
    }
}
