package com.test;

public class Hello {
    public static void main (String[] args) {

        int height1 = 1;
        int width1 = 2;
        int height2 = 3;
        int width2 = 4;
        int heightEtalon = 5;
        int widthEtalon = 5;

        String Rectangle1;
        String Rectangle2;

        if ((height1 <= heightEtalon && width1 <= widthEtalon) || (height1 <= widthEtalon && width1 <= heightEtalon)) {
            Rectangle1 = "Rectangle 1 can fit";
        } else {
            Rectangle1 = "Rectangle 1 not fit";
        }
        if ((height2 <= heightEtalon && width2 <= widthEtalon) || (height2 <= widthEtalon && width2 <= heightEtalon)) {
            Rectangle2 = "Rectangle 2 can fit";
        } else {
            Rectangle2 = "Rectangle 2 not fit";
        }

        System.out.println (Rectangle1 + ". " + Rectangle2);


        }
    }

