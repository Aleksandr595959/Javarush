package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i >= 0; i++) {
            String stop = reader.readLine();
            if (stop.equals("end")) {
                break;
            } else {
                strings.add(stop);
            }

        }
        for (String string : strings) {
            System.out.println(string);
        }
    }
}