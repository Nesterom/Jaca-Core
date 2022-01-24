package com.test.lesson20.classWork;

public class Student {
    private int rating;
    private final String name;
    private final String secondName;

    public Student (int rating, String name, String secondName){
        this.name = name;
        this.rating = rating;
        this.secondName = secondName;
    }
    public void setRating (int rating){
        this.rating = rating;
    }

    @Override
    public String toString () {
         return (name + " " + secondName + " " + rating);
    }
}
