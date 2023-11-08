package com.javarush.task.task04.task0443;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Как назвали, так назвали
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя");
        String name = reader.readLine();
        System.out.println("Ввведите день");
        int d = Integer.parseInt(reader.readLine());
        System.out.println("Введите месяц");
        int m = Integer.parseInt(reader.readLine());
        System.out.println("Введите год");
        int y = Integer.parseInt(reader.readLine());

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);


    }
}
