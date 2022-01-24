package Exam;

import java.util.Random;

public class Task1 {
    private static final Random RANDOM = new Random ();


    public static void main (String[] args) {
        int x = RANDOM.nextInt (10);
        int y = RANDOM.nextInt (10);
        int z = RANDOM.nextInt (10);
        double average = (x + y + z) / 3d;


        if (x > z){
            System.out.println (x + y);
        }

        System.out.println (average);
    }


}
