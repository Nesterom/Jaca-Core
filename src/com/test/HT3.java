package com.test;

import java.util.Arrays;

public class HT3 {
    public static void main (String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        int revers [] = new int[array.length];

        for (int i = 0; i < array.length; i++){
            revers[array.length - 1 - i] = array[i];
        }

        System.out.println(Arrays.toString (revers));
    }

}
