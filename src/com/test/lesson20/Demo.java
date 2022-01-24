package com.test.lesson20;

import java.lang.reflect.*;
import java.util.Arrays;

public class Demo {
    public static void main (String[] args) {
        Class<Box> boxClass = Box.class;
//        System.out.println (boxClass);
//        try {
//            Class<?> boxClass = Class.forName ("com.test.lesson20.Box");
//            System.out.println (boxClass);
//        } catch (ClassNotFoundException ignored){
//
//        }
        Class<AbstractBox> boxClassA = AbstractBox.class;
//        System.out.println (boxClassA);
        String fullName = boxClass.getName ();
        String name = boxClass.getSimpleName ();

        System.out.println (fullName);
        System.out.println (name);

        int boxClassModifaers = boxClassA.getModifiers ();
        System.out.println (boxClassModifaers);
        System.out.println (Modifier.isPrivate (boxClassModifaers));
        System.out.println (Modifier.isPublic (boxClassModifaers));
        System.out.println (Modifier.isAbstract (boxClassModifaers));

        Class<?> boxSuperClass = boxClass.getSuperclass ();
        System.out.println (boxSuperClass);

        Class<?>[] boxInterfaces = boxClass.getInterfaces ();
        System.out.println (Arrays.toString (boxInterfaces));

        Constructor<?> [] constructors = boxClass.getConstructors ();
        System.out.println (Arrays.toString (constructors));

        for (Constructor<?> c:
             constructors) {
            Class<?> [] parameterTypes = c.getParameterTypes ();
            System.out.println (Arrays.toString (parameterTypes));

            try {
                Constructor<?> constructor = boxClass
                        .getConstructor (int.class, int.class, int.class);
                System.out.println (constructor);
            } catch (NoSuchMethodException e){
            }

            try {
                Constructor<?> constructor = Box.class
                        .getConstructor (int.class, int.class, int.class);
                Box box = (Box) constructor.newInstance (1, 2, 3);
                box.print ();
            } catch (Exception e) {
                e.printStackTrace ();
            }
            Field[] fields = boxClass.getFields ();
            System.out.println (Arrays.toString (fields));

            try {
                Field field = boxClass.getField ("size");
                Box box  = new Box (1, 2, 3);
                Object value = field.get (box);
                System.out.println (value);
                field.set (box, "small");
                System.out.println (box.size);


            } catch (NoSuchFieldException e) {
                e.printStackTrace ();
            } catch (IllegalAccessException e) {
                e.printStackTrace ();
            }

        }
//        Method[] methods = boxClass.getMethods ();
//        Arrays.stream (methods).forEach (System.out::println);
        try {
            Method method = boxClass.getMethod ("printNameWithPrefix", String.class);
            System.out.println (method);

            Class<?>[] parameterTypes = method.getParameterTypes ();
            Class<?> returnType = method.getReturnType ();

            System.out.println (Arrays.toString (parameterTypes));
            System.out.println (returnType);

//            Method print = boxClass.getMethod ("print");
//            System.out.println (print);
        } catch (NoSuchMethodException e) {
            e.printStackTrace ();
        }

        try {
            Box box = new Box (1, 2, 3);
            Method method = boxClass.getMethod ("printNameWithPrefix", String.class);
            method.invoke (box, "pref");
            Method print = boxClass.getMethod ("print");
            print.invoke (box);
        } catch (Exception e) {
            e.printStackTrace ();
        }

        try{
            Box box = new Box (1, 2, 3);
            Field privateField = Box.class.getDeclaredField ("type");
            System.out.println (privateField);
            privateField.setAccessible (true);
            String fieldValue = (String) privateField.get (box);
            System.out.println ("Private field = " + fieldValue);
            privateField.set (box, "NewType");
            box.print ();

        } catch (Exception e) {
            System.out.println ("Error");
        }


    }
}
