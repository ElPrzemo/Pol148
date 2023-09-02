package org.example.Generic_Array;

public class GenericArray {

    public <T> void getArray(T[]array){
        for (T t: array){
            System.out.println(t);
        }
    }
}
