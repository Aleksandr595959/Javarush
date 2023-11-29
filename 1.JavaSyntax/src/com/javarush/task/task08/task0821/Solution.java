package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleMap();
        printPeopleMap(map);
    }

    public static Map<String, String> createPeopleMap() {
        Map<String,String> people = new HashMap<>();
        people.put("Петров","Василий");
        people.put("Петров","Евгений");
        people.put("Петров","Виталий");
        people.put("Попов","Виталий");
        people.put("Смирнов","Виталий");
        people.put("Козлов","Евгений");
        people.put("Сидоров","Александр");
        people.put("Сидоров","Руслан");
        people.put("Иванов","Иван");
        people.put("Смирнов","Алексей");

        return people;
    }

    public static void printPeopleMap(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
