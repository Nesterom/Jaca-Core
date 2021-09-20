package com.test.HT2_6;

public class MaxLength {
    public static void main (String[] args) {
        String s= "123 1234 12345 123 123456 12345";
        String [] array = s.split(" ");
        String maxlenthWord = "";
        for (String value : array) {
            if (value.length () >= maxlenthWord.length ()) {
                maxlenthWord = value;
            }
        }
        System.out.println(maxlenthWord);
    }
}
