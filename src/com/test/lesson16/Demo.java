package com.test.lesson16;


import com.sun.tools.javac.Main;

import java.util.LinkedList;
import java.util.Random;

public class Demo {
    private static final Random RANDOM = new Random ();
    private static final LinkedList<Box> BOX_LIST = new LinkedList<> ();

    private static void produce() {
        int count = 0;
        synchronized (BOX_LIST) {
            while (count < 10) {
                    if (BOX_LIST.isEmpty ()) {
                        BOX_LIST.add (Box.of (
                                        RANDOM.nextInt (10),
                                        RANDOM.nextInt (10),
                                        RANDOM.nextInt (10)
                                )
                        );
                        count++;
                        BOX_LIST.notify ();
                        try {
                            BOX_LIST.wait ();
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                    }
                }
        }
    }
    private static void consume() {
        int count = 0;
        synchronized (BOX_LIST) {
            while (count < 10) {
                    if (!BOX_LIST.isEmpty ()) {
                        Box box = BOX_LIST.poll ();
                        System.out.println (box);
                        count++;
                        BOX_LIST.notify ();
                        try {
                            BOX_LIST.wait ();
                        } catch (InterruptedException e) {
                            e.printStackTrace ();
                        }
                    }
                }
        }
    }
    public static void main (String[] args) throws InterruptedException {
        Thread prducer = new Thread (Demo::produce);
        Thread consumer = new Thread (Demo::consume);
        prducer.start ();
        consumer.start ();
        prducer.join ();
        consumer.join ();
        System.out.println ("Finish");
    }
}
