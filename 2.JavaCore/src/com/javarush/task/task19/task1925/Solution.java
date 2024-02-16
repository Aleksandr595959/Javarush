package com.javarush.task.task19.task1925;

import java.io.*;
import java.util.ArrayList;

/* 
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader fileInReader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter fileOutWriter = new BufferedWriter(new FileWriter(args[1]))){
            String line;
            StringBuilder stringBuilder = new StringBuilder();
            while ((line = fileInReader.readLine()) != null){
                String[] lines = line.split(" ");
                for (int i = 0; i < lines.length; i++) {
                    if (lines[i].length() > 6){
                        stringBuilder.append(lines[i]).append(",");
                    }
                }
            }
            String result = stringBuilder.substring(0, stringBuilder.length() - 1);
            fileOutWriter.write(result);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
