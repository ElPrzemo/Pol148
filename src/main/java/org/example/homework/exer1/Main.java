package org.example.homework.exer1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Class<?> checkedClass = Car.class;
        String className = checkedClass.getName();
        System.out.println("This class name " + className);

        System.out.println();

        Constructor<?>[] constructors = checkedClass.getDeclaredConstructors();
        int numberOfConstructors = constructors.length;
        System.out.println("Liczba konstruktorów: " + numberOfConstructors);

        Method[] methods = checkedClass.getMethods();

        int numberOfMethods = (int) Arrays.stream(methods).count();

        System.out.println("Number of methods: " + methods);

        System.out.println();
        System.out.println("Below we have list of all methods: ");
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println();
        System.out.println("Below list of all types returned by methods: ");
        for (Method method : methods) {

            Class returnParam = method.getReturnType();


            System.out.println("\nMethod Name : "
                    + method.getName());

            System.out.println("Return Type Details: " + returnParam.getName());
        }

        System.out.println();
        System.out.println("Below list of all names of methods: ");
        for (Method method : methods) {

            System.out.println("\nMethod Name : "
                    + method.getName());

        }
        System.out.println();
        System.out.println("Below list of all fields:");

        Field[] fields = Car.class.getFields();

        for (int i = 0; i < fields.length; i++) {


            System.out.println("Name of Field:"
                    + fields[i].getName());
        }


        System.out.println();
        System.out.println("Below list of all types of fields: ");

        for (int i = 0; i < fields.length; i++) {


            System.out.println("Type of Field:"
                    + fields[i].getType());
        }


    }


}




