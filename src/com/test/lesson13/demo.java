package com.test.lesson13;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class demo {

    public static void main (String[] args) throws IOException, ClassNotFoundException {
//        System.err.println ("123455");

//        Scanner in = new Scanner (System.in);
//        String s = in.nextLine ();
//        System.out.println ("String " + s);
//        int a = in.nextInt ();
//        System.out.println ("int " + a);
//        Box box = new Box ();
//
//        box.setBox ();
//        System.out.println (box);
//        BufferedReader reader = null;
//        try {
//            reader = new BufferedReader(
//                    new InputStreamReader (
//                    new FileInputStream ("src/com/test/lesson13/test.txt"),
//                    Charset.forName ("UTF-8")
//                    )
//            );
//            String line;
//            while ((line = reader.readLine ()) != null) {
//                System.out.println (line);
//            }
//        } catch (IOException e) {
//            e.printStackTrace ();
//        } finally {
//            if (reader != null){
//                try {
//                    reader.close ();
//                } catch (IOException e) {
//                    e.printStackTrace ();
//                }
//            }
//        }
//
//        try (
//                BufferedReader reader = new BufferedReader(
//                        new InputStreamReader(
//                                new FileInputStream ("src/com/test/lesson13/test.txt"),
//                                StandardCharsets.UTF_8
//                        )
//                    )
//        ){
//                     String line;
//                     while ((line = reader.readLine ()) != null){
//                        System.out.println (line);
//                    }
//                } catch (IOException e) {
//        }

//        List <String> lines = Files.readAllLines (
//                Paths.get ("src/com/test/lesson13/test.txt"),
//                StandardCharsets.UTF_8
//        );
//        for(String line: lines){
//            System.out.println (line);
//        }

//        Files.lines (
//                Paths.get ("src/com/test/lesson13/test.txt"),
//                StandardCharsets.UTF_8
//        ).forEach (System.out::println);
    FileOutputStream fos = new FileOutputStream (
        "src/com/test/lesson13/test.txt"
    );
    ObjectOutputStream oos = new ObjectOutputStream (fos);
    oos.writeInt (12345);
    oos.writeObject ("Today");
    oos.writeObject (new Date ());
    oos.close ();

    FileInputStream fis = new FileInputStream (
                "src/com/test/lesson13/test.txt"
        );
        ObjectInputStream ois = new ObjectInputStream (fis);
        int i = ois.readInt ();
        String today = (String) ois.readObject ();
        Date date = (Date) ois.readObject ();
        System.out.println (i);
        System.out.println (today);
        System.out.println (date);
    }
}
