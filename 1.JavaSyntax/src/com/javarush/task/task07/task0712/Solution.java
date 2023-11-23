package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        int maxStringLength = strings.get(0).length();
        int minStringLength = strings.get(0).length();
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() > maxStringLength) {
                maxStringLength = strings.get(i).length();
            }
            if (strings.get(i).length() < minStringLength) {
                minStringLength = strings.get(i).length();
            }
        }
        for (String string : strings) {
            if (string.length() == maxStringLength) {
                System.out.println(string);
                break;
            }
            if (string.length() == minStringLength) {
                System.out.println(string);
                break;
            }
        }
    }
}
