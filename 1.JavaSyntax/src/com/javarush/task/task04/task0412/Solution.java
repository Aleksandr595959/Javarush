package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
        int n = Integer.parseInt(m);
        if (n > 0) {
            System.out.println(n * 2);
        } else if (n < 0) {
            System.out.println(n + 1);
        }
    }

}