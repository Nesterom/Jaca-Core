package com.test;

import java.util.Arrays;

public class HT7 {
    public static void main (String[] args) {
        int[] array = {1, 2, 5, 6, 0, 3, 10, 20};
        int result = 0;
        int tempMinusOne = 0;
        int tempMinustwo = 0;
        int currentValue = 0;

        if (array.length == 1) {
            result = array[0];
        }
        if (array.length == 2) {
            result = Integer.max (array[0], array[1]);
        }
        if (array.length > 2) {
            tempMinustwo = array[0];
            tempMinusOne = Integer.max (array[0], array[1]);

            for (int i = 2; i < array.length; i++) {
                currentValue = Integer.max (tempMinusOne, (tempMinustwo + array[i]));
                tempMinustwo = tempMinusOne;
                tempMinusOne = currentValue;
            }
            result = currentValue;
        }
        System.out.println(result);
    }
}






