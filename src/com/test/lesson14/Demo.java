package com.test.lesson14;

public class Demo {
    interface Printable {
        void print(String message);

    public static void main (String[] args) {

        }
    public static void pintForAny(Printable obj, String message){
            obj.print (message);
        }

    }
}
