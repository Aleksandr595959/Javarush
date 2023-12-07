package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        Map<String, Cat> map = new HashMap<>();
        map.put("Том", new Cat("Том"));
        map.put("Вася", new Cat("Вася"));
        map.put("Пушок", new Cat("Пушок"));
        map.put("Сосиска", new Cat("Сосиска"));
        map.put("Сергей", new Cat("Серегей"));
        map.put("Беляшь", new Cat("Беляшь"));
        map.put("Петя", new Cat("Петя"));
        map.put("Василий", new Cat("Василий"));
        map.put("Стас", new Cat("Стас"));
        map.put("Олег", new Cat("Олег"));


        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        return new HashSet<>(map.values());
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
