package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> paramsMap = new LinkedHashMap<>();
        paramsMap.put("name", "Ivanov");
        paramsMap.put("country", "Ukraine");
        paramsMap.put("age", null);
        System.out.println(getQuery(paramsMap));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : params.keySet()) {
            String value = params.get(s);
            if (value != null) {
                if (stringBuilder.toString().length() != 0) {
                    stringBuilder.append(" and ");
                }
                stringBuilder.append(s + " = " + "'" + value + "'");
            }
        }
        return stringBuilder.toString().trim();
    }
}
//        name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'
//        name = 'Ivanov' and country = 'Ukraine' and city = 'Kiev'