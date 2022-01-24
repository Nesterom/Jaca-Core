package Exam.Task3;

public class Car {
    final String name;
    final Model carModel;
    private int engineCapacity;

    public Car (String name, Model carModel, int engineCapacity) {
        this.name = name;
        this.carModel = carModel;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString () {
        return  name + " " + carModel + " " + engineCapacity + System.lineSeparator ();
    }

    public int getEngineCapacity() {
        return engineCapacity;

    }
}
