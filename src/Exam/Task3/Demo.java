package Exam.Task3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Demo {
    public static void main (String[] args) throws IOException {
        Car car1 = new Car ("tesla", Model.MODELS, 1);
        Car car2 = new Car ("tesla", Model.MODELY, 2);
        Car car3 = new Car ("tesla", Model.MODELX, 3);
        Car car4 = new Car ("tesla", Model.MODELS, 3);
        Car car5 = new Car ("tesla", Model.MODELY, 2);
        Car car6 = new Car ("tesla", Model.MODELX, 1);
        Car car7 = new Car ("tesla", Model.MODELS, 3);
        Car car8 = new Car ("tesla", Model.MODELY, 1);
        Car car9 = new Car ("tesla", Model.MODELX, 2);
        Car car10 = new Car ("tesla", Model.MODELS, 2);

        List<Car> listOfCars = new ArrayList<> ();
        listOfCars.add (car1);
        listOfCars.add (car2);
        listOfCars.add (car3);
        listOfCars.add (car4);
        listOfCars.add (car5);
        listOfCars.add (car6);
        listOfCars.add (car7);
        listOfCars.add (car8);
        listOfCars.add (car9);
        listOfCars.add (car10);

        Map<Integer, List<Car>> map = listOfCars.stream().collect (Collectors.groupingBy (Car::getEngineCapacity));
        FileWriter myCars = new FileWriter ("Cars.txt");

        myCars.write (String.valueOf (map.get (2)));

        myCars.close ();



    }
}
