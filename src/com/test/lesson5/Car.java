package com.test.lesson5;

import java.util.Objects;

public class Car {
    final String lable;
    final String model;
    String color;
    String[] allowedColors = {"red", "green", "yelow"};


    public Car(String lable, String model, String color){
        this.color = color;
        this.lable = lable;
        this.model = model;

    }

    public void changeColor (String color) {

        for (String allowedColor : allowedColors) {
            if (Objects.equals (color, allowedColor)) {
                this.color = color;
                break;
            } else
                this.color = "black";
        }


    }

}
