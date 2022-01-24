package com.test.lesson16;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class ContactOne extends Contact{

    private String phoneNumber;


    public ContactOne (String name, String secondName, String phoneNumber) {
        super(name, secondName);
        this.phoneNumber = phoneNumber;
    }

}

