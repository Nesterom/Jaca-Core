package com.test.Lesson8;

public class Dog extends Animal{
    private int tailLengh;
    public Dog(int count){
        super(count);
    }


    public void move (){
        System.out.println ("Move Dog");
    }
    public String toString () {
        return "Dog{" +
                "legCount=" + getlegsCount () + '}';
    }

    public String getDog () {
        return "Gav";
    }

}
