package com.test;

import java.util.Arrays;

public class HT6 {
    public static void main (String[] args) {
        int[][] array1 = {{1, 0, 0, 0},
                {2, 3, 0, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 10}};

        int[][] array2 = {{1, 0, 0, 0},
                {2, 3, 0, 0},
                {4, 5, 6, 0},
                {7, 8, 9, 10}};
        int[][] arrayResult = new int [array1.length][array1.length];

        boolean errorFlag = false;
        if (array1.length != array2.length) {
            errorFlag = true;
            System.out.println ("unequal matrix size");
        } else {
            for (int i = 0; i < array1.length; i++) {
                if ((array1.length != array1[i].length) || (array2.length != array2[i].length)) {
                    errorFlag = true;
                    System.out.println ("Not square matrix");
                    break;
                }
                for (int j = 0; j < array1[i].length; j++) {
                    arrayResult[i][j] = array1[i][j] + array2[i][j];
                }
            }
        }
        if (!errorFlag){
            for (int[] ints : arrayResult) {
                System.out.println (Arrays.toString (ints));
            }

        }


    }
}





