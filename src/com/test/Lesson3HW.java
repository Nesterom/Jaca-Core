package com.test;

public class Lesson3HW {
    public static void main (String[] args) {
        int day = 43;
        int month = 13;
        int year = 0;
        int maxDay = 31;
        boolean validationError = false;
        String errorText = "";

        //Calculation of Max day of the month
        maxDay = month == 4 || month == 6 || month == 9 || month == 11 ? 30 : maxDay;
        maxDay = month == 2 ? 28 : maxDay;

        //End of calculation of Max day of the month
        //Validation of input parameters
        if (year < 1 || year > 9999) {
            errorText = year + " is invalid value for field year\n";
            validationError = true;
        }
        if (month < 1 || month > 12) {
            errorText = errorText + month + " is invalid value for field month\n";
            validationError = true;
        }
        if (day < 1 || day > maxDay) {
            errorText = errorText + day + " is invalid value for field day";
            validationError = true;
        }
        //End of validation of input parameters
        // Calculation of the next day
        if (validationError == false && (day == maxDay)) {
            day = 1;
            if (month == 12) {
                month = 1;
                year += 1;
            } else {
                month += 1;
            }
        } else {
            day += 1;
        }
        if (validationError == true) {
            System.out.println (errorText);
        } else {
            System.out.println (day + " " + month + " " + year);
        }


    }
}
