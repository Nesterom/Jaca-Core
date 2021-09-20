package com.test.HT2_3;

public class FiveNumbers {
    private static int count = 0;
    static double[] fiveNumbers = new double[5];
    private double avg;


    public FiveNumbers (){

    }

    public void store (double number) {
        fiveNumbers [count] = number;
        if (count < fiveNumbers.length - 1){
            count++;
        } else {
            count = 0;
        }
    }

    public double avg () {
        for (double fiveNumber : fiveNumbers) {
            avg += fiveNumber;
        }
        return avg/fiveNumbers.length;

    }
}
