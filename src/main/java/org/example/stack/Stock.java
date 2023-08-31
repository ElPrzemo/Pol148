package org.example.stack;

import org.example.exercise3.FullStackException;

public interface Stock {


    int push(String string) throws org.example.exercise3.FullStackException;

    int pop() throws org.example.exercise3.FullStackException;
    int peek() throws FullStackException;
    boolean isEmpty();

    boolean isEmpty(String[] array);
}
