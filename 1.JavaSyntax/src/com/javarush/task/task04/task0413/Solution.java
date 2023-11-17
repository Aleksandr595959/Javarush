package com.javarush.task.task04.task0413;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
День недели
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String m = reader.readLine();
        int n = Integer.parseInt(m);
        switch (n){
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;
            default:
                System.out.println("такого дня недели не существует");
                break;

        }

    }
}