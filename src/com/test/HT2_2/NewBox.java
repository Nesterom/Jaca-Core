package com.test.HT2_2;

public class NewBox {
    private static int count;
    int a;
    int b;
    int c;

    public NewBox (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public NewBox (int a) {
        this.a = a;
        this.b = a;
        this.c = a;
    }

    public int calculateVolume () {
        return a * b * c;

    }

    public String typeOfBox () {
        if (a == b && a == c && a != 0){
            return "Cube";
        } else if (a != 0 && b != 0 && c != 0){
            return "Regular Box";
        } else return "Envelope";

    }

}
