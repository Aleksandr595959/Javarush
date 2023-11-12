package com.javarush.task.task05.task0526;

/* 
Мужчина и женщина
*/

public class Solution {
    public static void main(String[] args) {
        Man man1 = new Man("Bob", 79, "Москва");
        Man man2 = new Man("Tom", 34, "Сочи");
        Woman woman = new Woman("Zina", 76, "Самара");
        Woman woman1 = new Woman("Lena", 56, "Ялта");
        System.out.println(man1);
        System.out.println(man2);
        System.out.println(woman);
        System.out.println(woman1);

    }

    public static class Man {
        public String name;
        public int age;
        public String address;

        public Man(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;

        }
            public String toString (){
            return (name+" "+ age+" "+address);

        }


    }

    public static class Woman {
        public String name;
        public int age;
        public String address;

        public Woman(String name, int age, String address) {
            this.name = name;
            this.age = age;
            this.address = address;
        }
        public String toString (){
            return (name+" "+ age+" "+address);

        }
    }
}
