package com.test;

import java.util.Arrays;

public class HT8 {
    public static void main (String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 2, 1, 2, 6, 5, 4, 3, 3, 2, 1, 1, 3, 3, 3, 4, 2};
        int rubles = 0;
        int salary = 0;

        if (array[0] < array[1]) {
            salary = 1;
        } else salary = 2;
        rubles = salary;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i - 1] > array[i])  {
                salary = salary -1;
                rubles = rubles + salary;
            }
            if (array[i - 1] < array[i]) {
                salary = salary + 1;
                rubles = rubles + salary;
            }


        }
        System.out.println (rubles);

    }
}

