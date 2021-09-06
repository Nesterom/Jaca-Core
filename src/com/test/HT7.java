package com.test;

import java.util.Arrays;

public class HT7 {
    public static void main (String[] args) {
        int[] array = {1, 0, 4, 8, 9, 1};
        int result = 0;
        int tempMax = 0;
        int tempMinusOne = 0;
        int tempMinustwo = 0;
        int currentValue = 0;

        if (array.length == 1){
            result = array[0];
        }
        if (array.length == 2) {
            result = Integer.max (array[0], array[1]);
        }
        if (array.length > 2){
            tempMinusOne = array[1];
            tempMinustwo = array[0];

            for (int i = 2; i < array.length; i++){
                currentValue = array[i];
                if (tempMinusOne >= (currentValue + tempMinustwo)) {
                    tempMax = tempMinusOne;
                    tempMinusOne = currentValue + tempMinustwo;
                    tempMinustwo = tempMax;
                } else {
                    tempMax = currentValue + tempMinustwo;
                    tempMinustwo = tempMinusOne;
                    tempMinusOne = tempMax;
                }
                result = tempMax;
                tempMax = 0;
            }
        }

        System.out.println (result);
    }
}





