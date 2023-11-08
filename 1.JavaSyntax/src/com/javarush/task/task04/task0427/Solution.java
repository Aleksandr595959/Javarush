package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0 && a % 2 == 0 && a <= 9) {
            System.out.println("четное однозначное число");
        } else if (a > 0 && a % 2 != 0 && a <= 9) {
            System.out.println("нечетное однозначное число");
        } else if (a > 0 && a % 2 == 0 && a <= 99) {
            System.out.println("четное двузначное число");
        } else if (a > 0 && a % 2 != 0 && a <= 99) {
            System.out.println("нечетное двузначное число");
        } else if (a > 0 && a % 2 == 0 && a <= 999) {
            System.out.println("четное трехзначное число");
        } else if (a > 0 && a % 2 != 0 && a <= 999) {
            System.out.println("нечетное трехзначное число");
        }
    }
}