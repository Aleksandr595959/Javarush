package com.javarush.task.task19.task1920;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Double> list = new HashMap<>();
        try (BufferedReader fileReader = new BufferedReader(new FileReader(args[0]))) {
            String line;
            while ((line = fileReader.readLine()) != null) {
                String[] lines = line.split(" ");
                if (list.containsKey(lines[0])) {
                    list.put(lines[0], list.get(lines[0]) + Double.parseDouble(lines[1]));
                } else {
                    list.put(lines[0], Double.parseDouble(lines[1]));
                }
            }
            double count = 0;
            for (Map.Entry<String, Double> entry : list.entrySet()) {
                if (entry.getValue() >= count) {
                    count = entry.getValue();
                }
            }
            for (Map.Entry<String, Double> entry : list.entrySet()) {
                if (entry.getValue() == count) {
                    System.out.print(entry.getKey() + " ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

