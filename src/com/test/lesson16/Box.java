package com.test.lesson16;

import org.jetbrains.annotations.Contract;

public class Box {
    private int x;
    private int y;
    private int z;

    private Box (int x, int y, int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public static Box of (int x, int y, int z) {
        return new Box (x, y, z);
    }

    @Override
    public String toString () {
        return x + "" + "" + y + "" + z;
    }
}
