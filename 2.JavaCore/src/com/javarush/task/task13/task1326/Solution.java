package com.javarush.task.task13.task1326;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Сортировка четных чисел из файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String address = reader.readLine();
        try (FileInputStream fileInputStream = new FileInputStream(address)) {
            StringBuilder stringBuilder = new StringBuilder();
            List<Integer> list = new ArrayList();
            int a;
            while ((a = fileInputStream.read()) != -1) {
                stringBuilder.append((char) a);
            }
            fileInputStream.close();
            String[] numbersAsString = stringBuilder.toString().split("\\s+");
            for (String numbers : numbersAsString) {
                int parseNumbers = Integer.parseInt(numbers);
                if (parseNumbers % 2 == 0) {
                    list.add(parseNumbers);
                }
            }
            Collections.sort(list);
            for (Integer numbers : list) {
                System.out.println(numbers);
            }
        } catch (IOException e) {

        }
    }
}

