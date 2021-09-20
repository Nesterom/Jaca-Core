package com.test.lesson5;

public class Box {
    private static int count;
    int a;
    int b;
    int c;

    public Box (int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        count++;
    }

    public Box (int a) {
        this.a = a;
        this.b = a;
        this.c = a;
        count++;
    }

    public Box () {
        count++;
    }

    public int calculateVolume () {
    return a * b * c;

    }
    public static int count () {
        return count;

    }
}
