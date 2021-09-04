package com.test;

import java.util.Date;

public class Lesson3 {
    public static void main (String[] args) {
        int day = 31;
        int month = 12;
        int year = 100;

        if (year < 1 || year > 9999) {
            System.out.println ("Incorrect value Year");
        } else {
            if (month < 1 || month > 12) {
                System.out.println ("Incorrect value Month");
            } else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) &&
                    (day < 1 || day > 31)) {
                System.out.println ("Incorrect value Day");
            } else if ((month == 4 || month == 6 || month == 9 || month == 11) && (day < 1 || day > 30)) {
                System.out.println ("Incorrect value Day");
            } else if ((month == 2) && (day < 1 || day > 28)) {
                System.out.println ("Incorrect value Day");
            } else {
                if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && (day == 31)) {
                    day = 1;
                    if (month == 12) {
                        month = 1;
                        year = year + 1;
                    } else {
                        month += 1;
                    }
                } else if ((month == 4 || month == 6 || month == 9 || month == 11) &&  (day == 30)){
                    day = 1;
                    if (month == 12) {
                        month = 1;
                        year = year + 1;
                    } else {
                        month += 1;
                    }
                } else if ((month == 2) &&  (day == 28)){
                    day = 1;
                    if (month == 12) {
                        month = 1;
                        year = year + 1;
                    } else {
                        month += 1;
                    }
                } else {
                    day += 1;
                }
                System.out.println (day + " " + month + " " + year);
            }

        }
    }
}