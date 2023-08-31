package org.example.exercise3;


public abstract   class ArrayStack implements Stock  {


    int buffor = 100;
    String[] stack = new String[buffor];
    private int top = stack.length-1;




    @Override
    public String push(String string) throws FullStackException {
        if (top >= buffor - 1) {
            throw new FullStackException("Stack is full");
        }
        top++;
        stack[top] = string;
        return ("Added to list: "+string);}

    @Override
    public String pop() throws FullStackException {
        if (isEmpty()) {
            throw new FullStackException("Stack is empty");
        }
        String item = stack[top];
        stack[top] = null;
        top--;
        return item;
    }

    @Override
    public String peek() throws FullStackException {
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
    }





//    public boolean isEmpty(String[] array ) {
//        for (String value : array) {
//            if (value != null) {
//                return false;
//            }
//        }
//        return true;

    }

