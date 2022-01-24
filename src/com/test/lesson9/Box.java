package com.test.lesson9;

public class Box <T> {
    private T prameter1;

    public Box(T prameter1) {
        this.prameter1 = prameter1;
    }

    public void setPrameter1 (T prameter1){
        this.prameter1 = prameter1;

    }

    public T getPrameter1() {
        return prameter1;
    }

    public int calculate (Box<Integer> box1, Box<Integer> box2){
        return box1.getPrameter1 () + box2.getPrameter1 ();
    }
    public static void compareString(Box<String> box1, Box<String> box2){
        System.out.println (box1.getPrameter1 ().equals (box2.getPrameter1 ()));
    }



}
