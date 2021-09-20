package com.test.lesson5;

public class Demo {

    public static void main (String[] args) {
        System.out.println (Box.count());
        Box box2 = new Box (2, 3, 4);
        Box cube = new Box (3);
        System.out.println (Box.count());
        System.out.println (box2.calculateVolume ());
        System.out.println (cube.calculateVolume ());

    }
}
