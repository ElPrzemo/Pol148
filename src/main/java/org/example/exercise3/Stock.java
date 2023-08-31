package org.example.exercise3;

public interface Stock {


    String push(String string) throws FullStackException;

    String pop() throws FullStackException;
    String peek() throws FullStackException;
    boolean isEmpty();

    boolean isEmpty(String[] array);
}
