package com.test;

public class HT2 {
    public static void main (String[] args) {
        int index = 20;
        int[] array = new int[index];
        int res = 0;
        array[0] = 0;
        array[1] = 1;

        for (int i = 2; i < index; i++) {
            array[i] = array[i - 1] + array [i - 2];
        }

        for (int i = 0; i < index; i = i + 3) {
            res = res + array[i];
        }
        System.out.println(res);
    }
}
