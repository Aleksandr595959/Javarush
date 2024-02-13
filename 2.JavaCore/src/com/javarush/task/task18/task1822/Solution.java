package com.javarush.task.task18.task1822;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Поиск данных внутри файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        String targetSubstring = args[0] + " ";
        try (BufferedReader reader1 = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader1.readLine()) != null) {
                if (line.startsWith(targetSubstring)) {
                    System.out.println(line);
                    break;
                }

            }
    }
}}
