package com.javarush.task.task19.task1908;

import java.io.*;

/* 
Выделяем числа
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\s+");
                for (String part : parts) {
                    if (part.matches("-?\\d+(\\.\\d+)?")) {
                        bufferedWriter.write(part + " ");
                    }
                }
            }
        }
    }
}