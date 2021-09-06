package com.test;

public class HT2 {
    public static void main (String[] args) {
        int[] array = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946};
        int index = 20;
        int res = 0;

        for (int i = 0; i < index; i = i + 3) {
            res = res + array[i];
        }
        System.out.println (res);
    }
}
