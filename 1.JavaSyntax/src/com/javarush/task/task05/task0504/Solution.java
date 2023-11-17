package com.javarush.task.task05.task0504;


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        Cat cat1 = new Cat("tom", 4, 5, 3);
        Cat cat2 = new Cat("bob", 5, 4, 5);
        Cat cat3 = new Cat("sid", 8, 9, 5);
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}