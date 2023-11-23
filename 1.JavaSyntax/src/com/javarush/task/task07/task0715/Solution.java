package com.javarush.task.task07.task0715;

import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add(0,"мама");
        strings.add(1,"мыла");
        strings.add(2,"раму");
        strings.add(1,"именно");
        strings.add(3,"именно");
        strings.add(5,"именно");

        for (String string:strings) {
            System.out.println(string);
        }
    }
}
