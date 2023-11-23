package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] number = new int[20];
        int[] number1 = new int[10];
        int[] number2 = new int[10];
        for (int i = 0; i < 20; i++) {
            number[i] = Integer.parseInt(reader.readLine());
        }
        for (int j = 0; j < 10; j++) {
            number1[j] = number[j];
            number2[j] = number[j + 10];
        }
        for (int n = 0; n < 10; n++) {
            System.out.println(number2[n]);
        }
    }
}
