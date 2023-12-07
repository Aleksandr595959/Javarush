package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
       private String name;
        private int age;
        private int number;
        private String gdg;
        private String day;
        private int fas;

        public Human(String name) {
            this.name = name;
        }

        public Human(int age) {
            this.age = age;
        }


        public Human() {
        }

        public Human(String name, int age, int number, String gdg) {
            this.name = name;
            this.age = age;
            this.number = number;
            this.gdg = gdg;
        }

        public Human(String name, String day, int fas) {
            this.name = name;
            this.day = day;
            this.fas = fas;
        }

        public Human(String name, String gdg, String day) {
            this.name = name;
            this.gdg = gdg;
            this.day = day;
        }

        public Human(String name, int age, int number, String gdg, String day, int fas) {
            this.name = name;
            this.age = age;
            this.number = number;
            this.gdg = gdg;
            this.day = day;
            this.fas = fas;
        }

        public Human(String name, int age, String gdg) {
            this.name = name;
            this.age = age;
            this.gdg = gdg;
        }

        public Human(String name, int number, int fas) {
            this.name = name;
            this.number = number;
            this.fas = fas;
        }

        public Human(int age, String day, int fas) {
            this.age = age;
            this.day = day;
            this.fas = fas;
        }
    }
}
