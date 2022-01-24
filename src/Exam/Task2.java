package Exam;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    private static final Random RANDOM = new Random ();

    public static void main (String[] args) {
        int[] array = {RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300,
                RANDOM.nextInt (600) - 300};

    int maxInt = -300;
    int maxIndex = 0;
    int minInt = 300;
    int minIndex = 0;


        for (int i = 0; i < array.length; i++) {
            if (maxInt <= array[i]){
                maxInt = array[i];
                maxIndex = i;
            }
            if (minInt >= array[i]){
                minInt = array[i];
                minIndex = i;
            }
        }
        System.out.println ("max is " + maxInt + " min is " + minInt);
        System.out.println (Arrays.toString (array));
        array[maxIndex] = array[maxIndex] * array[minIndex];
        System.out.println (Arrays.toString (array));


    }
}
