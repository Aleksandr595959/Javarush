package com.javarush.task.task04.task0415;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Правило треугольника
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        String m = reader.readLine();
        String l = reader.readLine();
        int a = Integer.parseInt(n);
        int b = Integer.parseInt(m);
        int c = Integer.parseInt(l);
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }

    }
}