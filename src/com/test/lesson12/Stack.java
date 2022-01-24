package com.test.lesson12;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    private LinkedList<T> list;
    public Stack(){
        list = new LinkedList<> ();
    }

    public Stack(LinkedList<T> list){
        this.list = list;
    }


    public boolean put(T object) {
        if (object != null){
            list.addFirst (object);
            return true;
        }
        return false;
    }

    public T pull() {
        return list.removeFirst ();
    }
    public void peek(){

    }

}
