package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
        int n = Integer.parseInt(m);
        int d;
        if (n%400==0){
            d = 366;
       } else if (n%100==0) {
            d = 365;
        } else if (n%4==0) {
            d = 366;
        }else {
            d=365;
        }
        System.out.println("количество дней в году: " + d);

    }
}