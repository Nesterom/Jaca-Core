package headfirst;

import java.util.ArrayList;

public class SimpleDotCom {
    private ArrayList<String> locationCells;
//    int numOfHits = 0;

    public void setLocationCells (ArrayList locs) {
        locationCells = locs;
    }

    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt (stringGuess);
        String result = "Мимо";
        int index = locationCells.indexOf (guess);

        if (index >= 0){
            locationCells.remove (index);
            if (locationCells.isEmpty ()) {
                result = "Потопил";
            } else {
                result = "Попал";
            }
        }

//        for (int cell : locationCells) {
//            if (guess == cell) {
//                result = "Попал";
//                numOfHits++;
//                break;
//            }
//        }
//        if (numOfHits == locationCells.length) {
//            result = "Потопил";
//        }
        System.out.println (result);
        return result;
    }



}
