package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    public static void main(String[] args) {
        System.out.println(labels);
    }

    static {
        labels.put(5.5, "Vova");
        labels.put(5.6, "Petya");
        labels.put(8.4, "Tom");
        labels.put(9.0, "Masha");
        labels.put(7.6, "Seva");
    }
}
