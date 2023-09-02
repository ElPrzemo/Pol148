package org.example.stack;



public interface Stock {




    int push(Integer integer) throws FullStackException;

    int pop() throws  FullStackException;
    int peek() throws FullStackException;
    boolean isEmpty();


}
