package com.test.lesson11.person;

import com.test.lesson11.Box;

import java.util.ArrayList;
import java.util.List;

public class DemoAdress {
    public static void main (String[] args) {
        Adress adress1 = new Adress ("Minsk", "Belarus", "Pobediteley", 4);
        Adress adress2 = new Adress ("Minsk", "Belarus", "Pobediteley", 5);
        Adress adress3 = new Adress ("Minsk", "Belarus", "Pobediteley", 6);
        List<Adress> list = new ArrayList<> ();

        list.add (adress1);
        list.add (adress2);
        list.add (adress3);


        System.out.println (adress1);
        System.out.println (adress2);
        System.out.println (adress3);


    }
}
