package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int[] n = new int[5];
        for (int i = 0; i < 5; i++) {
            n[i] = Integer.parseInt(reader.readLine());
        }
        Arrays.sort(n);

//        for (int values : n) {
//           System.out.println(values);
//
//        }
//        for (int i = 0; i < n.length; i++) {
//            System.out.println(n[i]);
//        }
        Arrays.stream(n).forEach(System.out::println);
    }
    
}


