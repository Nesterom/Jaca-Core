package com.test.HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Demo extends Thread{
    public static void main (String[] args) throws InterruptedException {
        Thread factory = new Thread (() -> {
            try {
                Factory.produce ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        });
        Army army1 = new Army ();
        Army army2 = new Army ();
        Thread createArmy1 = new Thread (army1::createRobot);
        Thread createArmy2 = new Thread (army2::createRobot);

        factory.start ();
        createArmy1.start ();
        createArmy2.start ();

        while (true){
            System.out.println ("negative test");
            System.out.println ();
                if (army1.equals (1)||army2.equals (1)){
                    System.out.println ("test");
            }
                sleep (1000);
        }




    }
}
