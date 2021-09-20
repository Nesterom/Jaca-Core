package com.test.Lesson8;

public class Demo {
    public static void main (String[] args) {
        Animal bird = new Bird (2);
        Animal dog = new Dog (4);

        bird.move ();
        dog.move ();



        System.out.println (bird.getlegsCount ());
        System.out.println (dog.getlegsCount ());

        System.out.println (((Dog)dog).getDog ());
    }

}

