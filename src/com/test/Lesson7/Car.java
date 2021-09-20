package com.test.Lesson7;

public class Car {
    private Lable lable;
    private Models model;
    private String color;
    private int wheelSize;

    public Car () {
    }
    public void setLable (Lable lable){
        this.lable = lable;
    }
    public void setModel (Models model){
       Models[] modelsList = model.getModelsList (this.lable);
        for (int i = 0; i < modelsList.length; i++) {
            if (model == modelsList[i]){
                this.model = model;
                return;
            }
        }

    }
    public void setColor (String color){
        this.color = color;
    }
    public void setWheelSize (int wheelSize){
        this.wheelSize = wheelSize;
    }
    public Lable getLable (){
        return lable;
    }
    public Models getModel (){
        return model;
    }
    public String getColor (){
        return color;
    }
    public int getWheelSize (){
        return wheelSize;
    }

}
