package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int counter1 = 0; //Счетчик положительных чисел
        int counter2 = 0; //Счетчик отрицательных чисел

        if (a != 0) {
            if (a > 0) {
                counter1++;
            } else {
                counter2++;
            }
        }
        if (b != 0) {
            if (b > 0) {
                counter1++;
            } else {
                counter2++;
            }
        }
        if (c != 0) {
            if (c > 0) {
                counter1++;
            } else {
                counter2++;
            }
        }
        System.out.println("количество отрицательных чисел: " + counter2);
        System.out.println("количество положительных чисел: " + counter1);


    }
}
