package com.test.lesson12;

public class MyStr {
    private String str;

    public MyStr (String str) {
        if (str == null){
            throw new NullPointerException ("String mist not be NULL");
        }
        this.str = str;
    }
    public void saveNewStr (String newStr) {

            if (newStr != null && newStr.length() > str.length()) {
                str = newStr;
            }
        }


    public void printStr (){
        System.out.println(str);
    }
}

