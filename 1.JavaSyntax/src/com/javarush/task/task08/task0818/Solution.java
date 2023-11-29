package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static Map<String, Integer> createMap() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Иванов",300);
        map.put("Петров",200);
        map.put("Сидоров",800);
        map.put("Соболев",1000);
        map.put("Козлов",900);
        map.put("Захаров",1300);
        map.put("Лебедев",1600);
        map.put("Морозов",1100);
        map.put("Кузнецов",700);
        map.put("Соколов",100);
        return map;
    }

    public static void removeItemFromMap(Map<String, Integer> map) {
        Map<String,Integer> copyMap = new HashMap<>(map);
        for (Map.Entry<String,Integer> pair : copyMap.entrySet()) {
            int n = pair.getValue();
                if (n<500){
                    map.remove(pair.getKey());
            }
        }
    }

    public static void main(String[] args) {

    }
}