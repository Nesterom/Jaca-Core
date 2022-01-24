package com.test.lesson12;

public class Demo {
    public static void main (String[] args) {
        MyStr str;
        try {
            str = new MyStr ("1234");
        } catch (NullPointerException e) {
            str = new MyStr ("");
            System.out.println ("Empty field was set");
        }

        str.printStr ();

        str.saveNewStr (null);



        str.printStr ();

    }
}
