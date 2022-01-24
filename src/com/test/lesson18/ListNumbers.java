package com.test.lesson18;


import java.util.ArrayList;
import java.util.List;

public class ListNumbers {
    private Integer number;
    private List<Integer> list;

    public ListNumbers () {

    }

    public static List<Integer> filterList (List<Integer> list, Integer number){

        List <Integer> result = new ArrayList<> ();
        list.removeIf (i -> i.equals (number));
        return result;
    }

}
