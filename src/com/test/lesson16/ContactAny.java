package com.test.lesson16;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

public class ContactAny extends Contact{

    private List<String> phoneList;


    public ContactAny (String name, String secondName, List<String> phoneList) {
        super(name, secondName);
        this.phoneList = phoneList;
    }

}

