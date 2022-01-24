package com.test.lesson17;


import com.test.lesson16.Box;

public class Demo {
    private static void run(Runnable r) {
        new Thread (r).start ();
    }

    public static void main (String[] args) {
        run (() -> System.out.println ("ho"));
        run (()-> {
            int result = 3 + 4;
            System.out.println (result);
        });
    }
}
