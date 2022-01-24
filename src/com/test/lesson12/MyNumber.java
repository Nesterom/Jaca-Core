package com.test.lesson12;

public class MyNumber {
    private int number;

    public MyNumber (int number){
        this.number = number;
    }

    public void calculateNewNumber (int newNumber){
        number = number + newNumber;
    }

    public void printNumber (){
        System.out.println (number);
    }
}
