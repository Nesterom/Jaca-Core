package com.test.classWork;

import java.util.ArrayList;

public class Phone {
    private int number;
    private String model;
    private double weight;


    public Phone () {

    }

    public void newPhone (int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }
    public void printPhone (){
        System.out.println ("number = " + number + " model = " + model + " weight = " + weight);
    }
    public String returnPhone (){
        return number + " " + model + " " + weight;
    }

    public int getNumber (){
        return number;
    }
}
