package com.javarush.task.task19.task1926;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileInReader = new BufferedReader(new FileReader(reader.readLine()))) {
            String line;
            while ((line = fileInReader.readLine()) != null) {
                StringBuilder stringBuilder = new StringBuilder();
                String newLine = stringBuilder.append(line).reverse().toString();
                System.out.println(newLine);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
