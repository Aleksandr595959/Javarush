package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        ArrayList<Integer> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string;
            for (int i = 0; i >= 0; i++) {
                string = reader.readLine();
                list.add(Integer.parseInt(string));
            }

        } catch (Exception e) {
            for (Integer values : list) {
                System.out.println(values);
            }
        }

    }
}

