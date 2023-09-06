package com.javarush.task.task01.task0128;

/* 
Просто, как 2+2
*/

public class Solution {
    public static void main(String[] args) {
        // вызов метода sum со значением параметров 2 и 2
        sum(2, 2);
    }

    // метод sum, который считает сумму двух чисел, переданных в качестве
    // аргументов метода, и выводит эту сумму на экран
    public static void sum(int a, int b) {
        int c = a + b;
        // выводим на экран переменную c (ее значение)
        System.out.print(c);
    }
}
