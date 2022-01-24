package com.test.lesson11;

import java.util.ArrayList;

public class Box {
    private String colour;
    private double weight;

    public Box (String colour, double weight) {
        this.colour = colour;
        this.weight = weight;
    }


    @Override
    public String toString () {
        return "colour = " + colour + " weight = " + weight;
    }

    public double getWeight (){
        return weight;
    }

    public static Box findBox (ArrayList<Box> list, double searchValue) {
        for (int i = 0; list.size () > i; i++) {

            if (list.get (i).getWeight () == searchValue){
                return list.get (i);
            }

        }
        return null;
    }
}
