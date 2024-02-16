package com.javarush.task.task19.task1923;

import java.io.*;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileInReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileOutWriter = new BufferedWriter(new FileWriter(args[1]))) {
            String line;
            while ((line = fileInReader.readLine()) != null) {
                String[] lines = line.split(" ");
                for (int i = 0; i < lines.length; i++) {
                    if (lines[i].matches(".*\\d.*")) {
                        fileOutWriter.write(lines[i] + " ");
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
