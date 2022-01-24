package headfirst;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        ArrayList<Integer> location = new ArrayList();
        location.add (1);
        location.add (2);
        location.add (3);
        dot.setLocationCells (location);
        String userGuess = "0";
        String result = dot.checkYourself (userGuess);
        String testResult = "Неудача";

        if (result.equals ("Попал")) {
            testResult = "Пройден";
        }

        System.out.println (testResult);
    }
}
