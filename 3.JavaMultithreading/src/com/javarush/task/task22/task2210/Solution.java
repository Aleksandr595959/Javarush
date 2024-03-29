package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer stringTokenizer = new StringTokenizer(query, delimiter);
        String[] tokensArray = new String[stringTokenizer.countTokens()];
        int index = 0;
        while (stringTokenizer.hasMoreTokens()) {
            tokensArray[index] = stringTokenizer.nextToken();
            index++;
        }

        return tokensArray;
    }
}
