package com.test;

import java.util.Arrays;

public class HT4 {
    public static void main (String[] args) {
        int[][] array = {{-1, 2, -3, 4, 5, -6, 7, 8, -9, -10, 11}, {-1, 2, -3, -4, -5, -6, 7, -48, 9, -10, 11}};
        int countPositive = 0;
        int countNegative = 0;

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (array[i][j] > 0) {
                    countPositive++;
                }
                if (array[i][j] < 0) {
                    countNegative++;
                }
            }
        }
        if (countPositive > countNegative){
            System.out.println("more positive values");
        } else if (countPositive < countNegative){
            System.out.println("more negative values");
        } else {
            System.out.println("equal number of positive and negative numbers");
        }


    }

}
