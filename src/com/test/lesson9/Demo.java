package com.test.lesson9;

public class Demo {
    public static void main (String[] args) {
        Box<String> box = new Box<> ("Hello");
        Box<String> box2 = new Box<> ("Hello");
        Box<Integer> integerBox = new Box<> (123);
        Box<Integer> integerBox1 = new Box<> (2);

        System.out.println (box.getPrameter1 ());
        System.out.println (integerBox.getPrameter1 ());
        System.out.println (integerBox.calculate (integerBox,integerBox1));
        Box.compareString (box, box2);
    }
}
