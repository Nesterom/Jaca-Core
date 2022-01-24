package com.test.lesson10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Demo {
    public static void main (String[] args) {
        ArrayList <String> list = new ArrayList<> ();
        LinkedList <String> listLinked = new LinkedList<> ();
        list.add ("String 1");
        list.add ("String 2");
        list.add ("String 3");
        list.add ("String 4");
        list.add ("String 5");
        listLinked.offer ("String 6");
        listLinked.offer ("String 7");
        listLinked.offer ("String 8");
        listLinked.offer ("String 9");
        listLinked.offer ("String 10");
        System.out.println (list);
        System.out.println (listLinked);
        list.remove (0);
        listLinked.remove (0);
        System.out.println (list);
        System.out.println (listLinked);
        list.remove ("String 3");
        listLinked.remove ("String 9");
        System.out.println (list);
        System.out.println (listLinked);
    }
}
