package com.test.lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
    public static void main (String[] args) {
        List<String> stringList = new ArrayList<String> (Arrays.asList ("asdsaddsa dasd", "adsfasfasfasfasda","asdasdasdasdasdasdasdasd"));
        int y = 0;
        y = (int) stringList.stream ()
                .filter ((i) -> {
                   return i.length () > 10 && i.length () < 20 && i.contains ("d");
                })
                .count ();
        System.out.println (y);
    }
}
