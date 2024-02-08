package com.javarush.task.task18.task1816;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        try (FileInputStream fileInputStream = new FileInputStream(args[0])) {
            int count = 0;
            while (fileInputStream.available() > 0) {
                int character = fileInputStream.read();
                if (isEnglishLetter((char) character)) {
                    count++;
                }
            }
            System.out.println(count);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static boolean isEnglishLetter(char ch) {
        return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
    }
}
