package com.test.lesson11.person;

import com.test.lesson11.Box;

import java.util.ArrayList;

public class Adress {
    private String city;
    private String country;
    private String street;
    private int house;

    public Adress (String city, String country, String street, int house){
        this.city = city;
        this.country = country;
        this.street = street;
        this.house = house;
    }

    @Override
    public String toString () {
        return "City = " + city + "Country = " + country + "street = " + street + "House = " + house + "/n";
    }

    public String getCity (){
        return city;
    }

    public static Adress findByCity (ArrayList<Adress> list, String searchValue) {
        for (int i = 0; list.size () > i; i++) {

            if (list.get (i).city  == searchValue){
                return list.get (i);
            }

        }
        return null;
    }
}
