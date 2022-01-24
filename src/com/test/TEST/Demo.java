package com.test.TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Demo {
    public static void main (String[] args) {
        List<Integer> robot = new ArrayList(Arrays.asList (1,  3, 4));
        List<Integer> list1 = new ArrayList(Arrays.asList (1, 2, 3, 4 ,5 ,6));
        List<Integer> list2 = new ArrayList(Arrays.asList (2, 4, 5, 6, 7, 8, 9 ,5));

        System.out.println (robot);
        System.out.println (list1);
        System.out.println (list2);

        list1.removeAll (robot);
        System.out.println ("removeall");
        System.out.println (robot);
        System.out.println (list1);
        System.out.println (list2);



//        robot.retainAll (list1);

        for (int i = 0; i < list2.size (); i++){
            if (list1.contains (list2.get (i))) {
                robot.add (list2.get (i));
                list2.remove (i);
                break;
            }
        }



//        list2.forEach (i -> {
//            if (list1.contains (list2.get (i))) {
//                robot.add (list2.get (i));
//                list2.remove (i);
//            }});


        System.out.println ("for");
        System.out.println (robot);
        System.out.println (list1);
        System.out.println (list2);



    }
}
