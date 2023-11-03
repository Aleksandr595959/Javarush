package com.javarush.task.task04.task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int max = a > b ? a > c ? a : c : b > c ? b : c;
        //int max1 = b > c ? b : c;
       // int max = max2 > max1 ? max2 : max1;
        //System.out.print(max);
        //int sr2 = a < b ? a : b;
        //int sr1 =

       // int sr = 0;

        int min2 = a < b ? a : b;
        int min1 = b < c ? b : c;
        int min = min2 < min1 ? min2 : min1;
        System.out.println(max + " " + min);
          //if (a>=b && a<=c){
              //   sr = a ;
           //}else if(b>=a && b<=c){
            //    sr = b;
       //  }else if(c>=a && c<=b){
              //sr = c;
    }

    // System.out.println(max + " " + sr + " " + min);

}

