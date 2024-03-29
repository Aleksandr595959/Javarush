package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(args[1]);
             FileOutputStream fileOutputStream = new FileOutputStream(args[2])) {
            if (args[0].equals("-e")) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() + 32);
                }
            }
            if (args[0].equals("-d")) {
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read() - 32);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
