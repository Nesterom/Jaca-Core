package com.test.Lesson8;

public abstract class Animal implements Movable {
    private int legsCount;

    protected Animal(int legsCount){
        this.legsCount = legsCount;
    }

    public int getlegsCount (){
        return legsCount;
    }



}
