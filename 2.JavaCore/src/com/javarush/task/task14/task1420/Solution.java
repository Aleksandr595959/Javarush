package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();

        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                listA.add(i);
            }
        }
        for (int i = 1; i <= b; i++) {
            if (b % i == 0) {
                listB.add(i);
            }
        }

        Set<Integer> commonNumbers = new HashSet<>(listA);
        commonNumbers.retainAll(listB);
        ArrayList<Integer> listAB = new ArrayList<>(commonNumbers);
        Collections.sort(listAB, Collections.reverseOrder());
        System.out.println(listAB.get(0));
    }
}
