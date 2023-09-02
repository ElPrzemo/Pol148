//package org.example.stack;
//
//
//
//
//public  class ArrayStack implements Stock {
//
//
//    int buffor = 100;
//    int[] stack = new int[buffor];
//    private int top = -1;
//
//
//    @Override
//    public int push(Integer integer) throws FullStackException {
//        if (top >= buffor - 1) {
//            throw new FullStackException("Stack is full");
//        }
//        top++;
//        stack[top] = top;
//        return Integer.parseInt(("Added to list: "+integeri));}
//
//    @Override
//    public int pop() throws FullStackException {
//        if (isEmpty()) {
//            throw new FullStackException("Stack is empty");
//        }
//        int item = stack[top];
//        stack[top] = Integer.parseInt(null);
//        top--;
//        return item;
//    }
//
//    @Override
//    public int peek() throws FullStackException {
//        if (isEmpty()) {
//            throw new FullStackException("Stack is empty");
//        }
//        return stack[top];
//    }
//
//
//    @Override
//    public boolean isEmpty() {
//        return top == -1;
//    }
//
//
//}
//
//
//
//
