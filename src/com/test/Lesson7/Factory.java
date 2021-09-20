package com.test.Lesson7;

public class Factory {


    public Factory(){

    }
    public Car createCar (Lable lable, Models model, String color, int wheelSize){
      Car car1 = new Car ();
        car1.setLable (lable);
        car1.setModel (model);
        car1.setColor (color);
        car1.setWheelSize (wheelSize);
        return car1;
    }

}
