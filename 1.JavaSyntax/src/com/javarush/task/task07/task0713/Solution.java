package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            number.add(Integer.parseInt(reader.readLine()));
        }

        ArrayList<Integer> number3 = new ArrayList<>();
        ArrayList<Integer> number2 = new ArrayList<>();
        ArrayList<Integer> numberFull = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            if (number.get(i)%2 == 0 && number.get(i)%3 == 0) {
                number2.add(number.get(i));
                number3.add(number.get(i));
            }else if (number.get(i)%2 == 0){
                number2.add(number.get(i));
            }else if (number.get(i)%3 == 0){
                number3.add(number.get(i));
            }else{
                numberFull.add(number.get(i));
            }
        }
        printList(number2);
        printList(number3);
        printList(numberFull);
    }

    public static void printList(ArrayList<Integer> list) {
        for (Integer n : list) {
            System.out.println(n);
        }
    }
}
