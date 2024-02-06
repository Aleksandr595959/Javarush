package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        FileInputStream b = new FileInputStream(a);
        int max = 0;
        while (b.available() > 0) {
            int data = b.read();
            if (data > max) {
                max = data;
            }
        }
        b.close();
        System.out.println(max);
    }
}
