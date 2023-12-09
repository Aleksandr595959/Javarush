package com.javarush.task.task11.task1123;

public class Solution {
    public static void main(String[] args) {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

        Pair result = getMinimumMaximumPair(data);

        System.out.println("The minimum is " + result.x);
        System.out.println("The maximum is " + result.y);
    }

    public static Pair getMinimumMaximumPair(int[] inputArray) {
        if (inputArray == null || inputArray.length == 0) {
            return new Pair(null, null);
        }
        int[] inoutArrayCopy = inputArray.clone();
        for (int i = 0; i < inoutArrayCopy.length; i++) {
            for (int j = 0; j < inoutArrayCopy.length; j++) {
                if (inoutArrayCopy[i] < inoutArrayCopy[j]){
                    int a =inoutArrayCopy[i];
                    inoutArrayCopy[i]=inoutArrayCopy[j];
                    inoutArrayCopy[j]=a;
                }
            }
        }
        int length = inoutArrayCopy.length-1;
        int min = inoutArrayCopy[0];
        int max = inoutArrayCopy[length];
        return new Pair(min, max);
    }

    public static class Pair {
        public Integer x;
        public Integer y;

        public Pair(Integer x, Integer y) {
            this.x = x;
            this.y = y;
        }
    }
}
