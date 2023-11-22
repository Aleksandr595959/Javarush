package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] string = new String[10];
        int[] stringLength = new int[10];
        for (int i = 0; i < string.length; i++) {
            string[i]= reader.readLine();
        }
        for (int j = 0; j < stringLength.length; j++) {
            stringLength[j] = string[j].length();

        }
        for (int l = 0; l < stringLength.length; l++) {
            System.out.println(stringLength[l]);
        }
    }
}
