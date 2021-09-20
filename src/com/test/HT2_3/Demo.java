package com.test.HT2_3;

import java.sql.SQLOutput;

public class Demo {
    public static void main (String[] args) {
        FiveNumbers fiveNumbers = new FiveNumbers ();
        fiveNumbers.store (6);
        fiveNumbers.store (122);
        fiveNumbers.store (3);
        fiveNumbers.store (4);
        fiveNumbers.store (5);
        fiveNumbers.store (55);
        fiveNumbers.store (7);
        System.out.println ( fiveNumbers.avg ());

    }
}
