package com.test.lesson11;

import java.util.ArrayList;

public class Demo {

    public static void main (String[] args) {
        Box box1 = new Box ("Green",12);
        Box box2 = new Box ("Red", 34);
        Box box3 = new Box ("Blue", 44);
        ArrayList<Box> list = new ArrayList<> ();

        System.out.println (box1);
        System.out.println (box2);
        System.out.println (box3);
        list.add (box1);
        list.add (box2);
        list.add (box3);




    }
}
