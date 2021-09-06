package com.test;

public class HT5 {
    public static void main (String[] args) {
        int[][] array = {{1, 0, 0, 0},
                         {2, 3, 0, 0},
                         {4, 5, 6, 0},
                         {7, 8, 9, 10}};
        boolean notTriangle = false;
        boolean notSquare = false;


        for (int i = 0; i < array.length; i++){
            if (array.length != array[i].length) {
                notSquare = true;
                break;
            }
            for (int j = i + 1; j < array[i].length; j++){
                if (array[i][j] != 0) {
                    notTriangle = true;
                    break;
                }
            }
        }
        if (notSquare == true){
            System.out.println ("Not square matrix");
        } else if (notTriangle == true){
            System.out.println ("Not lower triangular matrix");
        } else {
            System.out.println ("lower triangular matrix");
        }

    }

}



