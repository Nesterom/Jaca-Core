package com.test;

public class HT1 {
    public static void main (String[] args) {
        int[] array = {1, 2, 3, 6, 6};
        int x = 6;
        int res = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != x) {
                res = res + array[i];
            }
        }
        System.out.println (res);
    }
}
