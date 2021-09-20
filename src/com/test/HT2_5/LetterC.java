package com.test.HT2_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LetterC {
    public static void main (String[] args) {
        String str = "Привет,  сСс сасас  спас с";
        Pattern pattern = Pattern.compile ("\\b(?:[^с|^С ]*с|С){3}\\S*\\b");
        Matcher matcher = pattern.matcher (str);
        int count = (int) matcher.results().count ();

        System.out.println (count);

    }
}
