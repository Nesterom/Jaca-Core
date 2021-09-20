package com.test.Lesson8;

public class Bird extends Animal{
    private int wingsCount;

    public Bird (int count){
        super (count);
    }


    public void move (){
        System.out.println ("Fly Bird");
    }


}
