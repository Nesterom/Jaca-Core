package com.test.HW6;

import com.test.lesson16.Box;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

public class Factory extends Thread{
    private static final Random RANDOM = new Random ();
    private static final ArrayList<Integer> PARTS_LIST = new ArrayList<> ();


    public Factory () {
    }

    public static void produce () throws InterruptedException {
        while (true) {
            PARTS_LIST.add (RANDOM.nextInt (5));
            System.out.println ("new detail created" + PARTS_LIST);

        sleep (1000);
        }
    }
    public synchronized static ArrayList<Integer> getParts () {
        return PARTS_LIST;
    }

    public static void removeDetail (Integer i){
        PARTS_LIST.remove (i);
    }
}
