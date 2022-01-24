package com.test.classWork;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main (String[] args) {
        Phone phone1 = new Phone ();
        Phone phone2 = new Phone ();
        Phone phone3 = new Phone ();
        ArrayList<Phone> list = new ArrayList<> ();
        int searchValue = 2;
        String result = "";

        phone1.newPhone (1,"Samsung", 100.4);
        phone2.newPhone (2,"Xaomi", 123);
        phone3.newPhone (2,"Alcatel",200.4);

        phone1.printPhone ();
        phone2.printPhone ();
        phone3.printPhone ();

        list.add (phone1);
        list.add (phone2);
        list.add (phone3);

        for (int i = 0; list.size () > i; i++) {

            if (list.get (i).getNumber () == searchValue){
                result = result + list.get (i).returnPhone () + "; ";
            }

        }
        System.out.println (result);
    }
}

