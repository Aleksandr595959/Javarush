package com.javarush.task.task08.task0816;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static Map<String, Date> createMap() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
        Map<String, Date> map = new HashMap<>();
        map.put("Смирнов", dateFormat.parse("MAY 1 2012"));
        map.put("Соболев", dateFormat.parse("Jan 2 2000"));
        map.put("Сорокин",dateFormat.parse("Sept 5 2005"));
        map.put("Семечкин", dateFormat.parse("Nov 8 1995"));
        map.put("Петров",dateFormat.parse("Dec 26 1992"));
        map.put("Задорнов",dateFormat.parse("Oct 7 1899"));
        map.put("Дедищев",dateFormat.parse("Feb 16 1999"));
        map.put("Цареградцев", dateFormat.parse("Aug 20 2009"));
        map.put("Сысоев", dateFormat.parse("Jul 9 1996"));
        map.put("Курочкин", dateFormat.parse("Feb 27 1998"));
        return map;
    }

    public static void removeAllSummerPeople(Map<String, Date> map) {
        Map<String, Date> copy = new HashMap<>(map);
        for (String key : copy.keySet()) {
            Date date = copy.get(key);
            int month = date.getMonth() + 1;
            if (month == 6 || month == 7 || month == 8) {
                map.remove(key);
            }
        }

    }

    public static void main(String[] args) {

    }
}
