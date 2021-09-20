package com.test.HT2_8;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CardNumber {
    public static void main (String[] args) {
        String str = "fff 1111-1111-1111-1111";
        Pattern pattern = Pattern.compile ("\\d{4}-\\d{4}-\\d{4}-\\d{4}");
        Matcher matcher = pattern.matcher (str);
        System.out.println (matcher.group (str));
    }
}
