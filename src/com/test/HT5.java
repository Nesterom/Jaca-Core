package com.test;

public class HT5 {
    public static void main (String[] args) {
        int[][] array = {{1, 0, 0, 0},
                         {2, 3, 0, 0},
                         {4, 5, 6, 0},
                         {7, 8, 9, 10}};
        boolean errorFlag = false;



        for (int i = 0; i < array.length; i++){
            if (array.length != array[i].length) {
                errorFlag = true;
                System.out.println ("Not square matrix");
                break;
            }
            for (int j = i + 1; j < array[i].length; j++){
                if (array[i][j] != 0) {
                    errorFlag = true;
                    System.out.println ("Not lower triangular matrix");
                    break;
                }
            }
        }
        if (errorFlag != true){
            System.out.println ("lower triangular matrix");
        }
    }

}



