package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Lesson4 {
    public static void main (String[] args) {
       int[] array = {1, 2, 3, 5, 6, 7};

        System.out.println ();
        for (int i:array) {
            System.out.println (Arrays.toString (array));

            System.out.println ("Push");
        }
    }
}
