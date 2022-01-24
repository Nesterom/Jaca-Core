package com.test.HW6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Army extends Thread {
    private static final List<Integer> robotDesign = new ArrayList (Arrays.asList (0, 1, 2, 3, 4, 5));
    private Integer robotsCount = 0;
    private List<Integer> robot = new ArrayList<> ();


    public Army () {
    }

    public void createRobot () {
        List<Integer> robot = new ArrayList<> ();
        System.out.println ("Robot producing started");
        ArrayList<Integer> tmp = (ArrayList<Integer>) robotDesign;
        ArrayList<Integer> tmp2 = (ArrayList<Integer>) robotDesign;
        Integer detail = 0;


        for (int l = 0; this.robotsCount < 1; l++) {
//            System.out.println ("ROBO1");
            tmp = (ArrayList<Integer>) robotDesign;
            tmp2 = (ArrayList<Integer>) Factory.getParts ();
            tmp.removeAll (robot);
            ArrayList<Integer> finalTmp = tmp;

                detail = tmp2.stream ()
                        .filter (i -> Factory.getParts ().contains (finalTmp))
                        .findFirst ()
                        .orElse (0);

                if (detail != 0){
                    robot.add (detail);
                }



            if (robot.equals (robotDesign)) {
                this.robotsCount++;
                System.out.println ("NEW ROBOT CREATED");
                robot.clear ();

            }
            tmp.clear ();
            tmp2.clear ();
        }
    }
}


