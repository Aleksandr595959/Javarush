package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = reader.readLine();
            if (s.equals("exit")) {
                break;
            }
            try {
                double value = Double.parseDouble(s);
                if (s.contains(".")) {
                    print(value);
                } else if (value > 0 && value < 128) {
                    print((short) value);
                } else if (value <= 0 || value >= 128) {
                    print((int) Math.round(value));
                }

            } catch (Exception e) {
                print(s);
            }

        }
        reader.close();

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
