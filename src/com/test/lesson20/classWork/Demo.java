package com.test.lesson20.classWork;

import java.lang.reflect.Constructor;
import java.util.Collection;

public class Demo {

    public static void main (String[] args) {
        try {
            Constructor<?> constructor = Student.class.getConstructor (int.class, String.class, String.class);


        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
