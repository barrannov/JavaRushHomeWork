package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by Sasha on 15.07.2016.
 */
public  class ImageReaderFactory {

   public static ImageReader getReader(ImageTypes imageType){
       if (imageType == ImageTypes.BMP) return new BmpReader();
       else
       if (imageType == ImageTypes.JPG) return new JpgReader();
       else
       if (imageType == ImageTypes.PNG) return new PngReader();
       else
           throw new IllegalArgumentException("Неизвестный тип картинки");

       }

   }
