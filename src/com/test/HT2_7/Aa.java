package com.test.HT2_7;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aa {
    public static void main (String[] args) {
        String str = "ариваа  асСса асасаса  спас с";
        Pattern pattern = Pattern.compile ("\\bа\\w*?а\\b");
        Matcher matcher = pattern.matcher (str);

        System.out.println (matcher.matches ());

    }
}
