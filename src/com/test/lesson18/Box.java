package com.test.lesson18;

public class Box {
    private final int x;
    private final int y;
    private final int z;

    public Box (int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    @Override
    public String toString () {
        String s = String.valueOf (x);
        s = s + "  " + String.valueOf (y);
        s = s + "  " + String.valueOf (z);
        return s;
    }
}
