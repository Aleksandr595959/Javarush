package com.javarush.task.task02.task0217;

/* 
Минимум четырех чисел
*/

public class Solution {
    public static int min(int a, int b, int c, int d) {
        // вызов метода min(a, b) вернет минимальное из a и b, вызов метода
        // min(c, d) вернет минимальное из c и d, а вызов метода min уже на
        // результатах min(a, b) и min(c, d) вернет минимальное из a, b, c и d
        return min(min(a, b), min(c, d));
    }

    public static int min(int a, int b) {
        // проверяем условие a < b
        if (a < b) {
            // если a < b, то возвращаем a (оператор return предназначен
            // для возврата результата работы метода)
            return a;
        } else {
            // иначе возвращаем b
            return b;
        }
    }

    public static void main(String[] args) {
        // выводим на экран результат вызова метода min(a, b) с параметрами
        // -20 и -10
        System.out.println(min(-20, -10));
        // выводим на экран результаты вызова метода min(a, b, c, d)
        // с различными параметрами
        System.out.println(min(-40, -10, -30, 40));
        System.out.println(min(-20, -40, -30, 40));
        System.out.println(min(-20, -10, -40, 40));
        System.out.println(min(-20, -10, -30, -40));
    }
}
