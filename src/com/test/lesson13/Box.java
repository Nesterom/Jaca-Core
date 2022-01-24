package com.test.lesson13;

import java.util.Scanner;

public class Box {
    private int a;
    private int b;
    private int c;


    public Box () {

    }
    public void setBox (){
        boolean error = true;
        Scanner in = new Scanner (System.in);
        while (error){
            try {
                this.a = in.nextInt ();
                this.b = in.nextInt ();
                this.c = in.nextInt ();
                error = false;
            } catch (Exception e) {
                System.out.println ("Try again");
                error = true;
                in.next ();
            }
        }


    }


       @Override
       public String toString () {
           return "Height " + a + "\n" +
                   "Width " + b + "\n" +
                   "Length " + c;
       }
   }



