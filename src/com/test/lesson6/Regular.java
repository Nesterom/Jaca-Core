package com.test.lesson6;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regular {
    public static void main (String[] args) {
        String str = "Hello!";
        Pattern pattern = Pattern.compile ("\\s");
        Matcher matcher = pattern.matcher (str);

        System.out.println (matcher.find ());

    }
}
