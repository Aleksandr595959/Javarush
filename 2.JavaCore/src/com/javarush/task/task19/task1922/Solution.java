package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] lines = line.split("[\\s,!.?;:]+");
                int count = 0;
                for (int i = 0; i < lines.length; i++) {
                    String cleanText = lines[i];
                    for (String strings : words) {
                        if (strings.equals(cleanText)) {
                            count++;
                        }
                    }
                }
                if (count == 2) {
                    System.out.println(line);
                }

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
