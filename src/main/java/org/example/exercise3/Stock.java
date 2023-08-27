package org.example.exercise3;

public interface Stock {

    void push();

    String push(String string) throws FullStackException;

    String pop() throws FullStackException;
    String peek() throws FullStackException;
    boolean isEmpty();
}
