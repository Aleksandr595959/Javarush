package com.javarush.task.task19.task1919;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) {
        TreeMap<String, Double> list = new TreeMap<>();
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
            for (Map.Entry<String, Double> entry : list.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
