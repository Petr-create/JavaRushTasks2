package com.javarush.task.task16.task1631;

import com.javarush.task.task16.task1631.common.*;

public class ImageReaderFactory {
    public static ImageReader getImageReader(ImageTypes jpg) {
        if(jpg != null){
            if (jpg.equals(ImageTypes.PNG)) {
                return new PngReader();
            } else if (jpg.equals(ImageTypes.JPG)) {
                return new JpgReader();
            } else if (jpg.equals(ImageTypes.BMP)) {
                return new BmpReader();
            }
        }

        throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
