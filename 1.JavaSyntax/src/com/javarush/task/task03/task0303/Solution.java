package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        double rub1 = convertEurToUsd(50,100);
        double rub2 = convertEurToUsd(60,100);
        System.out.println(rub1);
        System.out.println(rub2);

    }

    public static double convertEurToUsd(int eur, double exchangeRate) {
        return eur * exchangeRate;
        //fffddddddd
    }
}
