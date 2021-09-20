package com.test.Lesson7;

public class Demo {
    public static void main (String[] args) {
        Car car1 = new Car ();
        Car car2 = new Car ();
        Car car3 = new Car ();


        car1.setLable (Lable.KIA);
        car1.setModel (Models.RIO);
        car1.setColor ("Red");
        car1.setWheelSize (16);

        car2.setLable (Lable.SKODA);
        car2.setModel (Models.KAROQ);
        car2.setColor ("Gray");
        car2.setWheelSize (17);

        car3.setLable (Lable.MERSEDES);
        car3.setModel (Models.B200);
        car3.setColor ("Blue");
        car3.setWheelSize (18);

    }
}
