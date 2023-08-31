package org.example.stack;


import org.example.exercise3.Stock;

public abstract   class ArrayStack implements Stock {


    int buffor = 100;
    int[] stack = new int[buffor];
    private int top = stack.length-1;




    @Override
    public int push(String string) throws FullStackException {
        if (top >= buffor - 1) {
            throw new FullStackException("Stack is full");
        }
        top++;
        stack[top] = Integer.parseInt(string);
        return Integer.parseInt(("Added to list: "+string));}

    @Override
    public int pop() throws FullStackException {
        if (isEmpty()) {
            throw new FullStackException("Stack is empty");
        }
        int item = stack[top];
        stack[top] = Integer.parseInt(null);
        top--;
        return item;
    }

    @Override
    public int peek() throws FullStackException {
        if (isEmpty()) {
            throw new FullStackException("Stack is empty");
        }
        return stack[top];
    }


    @Override
    public boolean isEmpty(String[] array) {
        for (String value : array) {
            if (value != null) {
                return false;
            }
        }
        return true;
    }}




