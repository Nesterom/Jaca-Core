package com.test.lesson20;


@Reflectable (name = "box", value = "some object")
public class Box extends AbstractBox implements Printable  {
    private String type;
    public String size = "big";
    public Box (int x, int y, int z){
        super(x, y, z);
        type = "box";
    }

//    public Box (int x, int y){
//        int z = 89;
//        super(x, z, y);
//        type = "box";
//    }

    public void print ()  {
        System.out.println (x + " " + y + " " + z + " " + type);
    }
    public void printNameWithPrefix(String pref) {
        System.out.println (pref + name);
    }
    private String getSize(){
        return size;
    }
}
