//package org.example.generic_stack;
//
//
//public  class GenericStack<T> {
//
//
//    int buffor = 100;
//    T[] stack = (T[]) new Object[buffor];
//    private int top = -1;
//
//
//
//    public void push(T t) throws FullStackException {
//        if (top >= buffor - 1) {
//            throw new FullStackException("Stack is full");
//        }
//        top++;
//        stack[top] = t;
//
//        System.out.println("Added to stock: " + t);
//    }
//
//
//    public T pop() throws FullStackException {
//        if (isEmpty()) {
//            throw new FullStackException("Stack is empty");
//        }
//        T item = stack[top];
//        stack[top] = null;
//        top--;
//        return item;
//    }
//
//
//
//
//    public T peek() throws FullStackException {
//        if (isEmpty()) {
//            throw new FullStackException("Stack is empty");
//        }
//        return stack[top];
//    }
//
//
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
