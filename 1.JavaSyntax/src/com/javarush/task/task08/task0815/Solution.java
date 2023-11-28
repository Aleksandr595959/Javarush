package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.Map;

/* 
Перепись населения
*/

public class Solution {
    public static Map<String, String> createMap() {
        Map<String, String> human = new HashMap<>();
        human.put("Bob", "Marley");
        human.put("Сергей", "Зверев");
        human.put("Евгений", "Пригожин");
        human.put("Иосиф", "Сталин");
        human.put("Владимир", "Жириновский");
        human.put("Геннадий", "Головкин");
        human.put("Майк", "Тайсон");
        human.put("Федор", "Емельяненко");
        human.put("Виктор", "Цой");
        human.put("Василий", "Афанасьев");
        return human;
    }

    public static int getCountTheSameFirstName(Map<String, String> map, String name) {
        int count = 0;
        for (String s : map.values()) {
            if (s.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
        int count1 = 0;
        for (String e : map.keySet()) {
            if (e.equals(lastName)) {
                count1++;
            }
        }
        return count1;
    }

    public static void main(String[] args) {

    }
}
