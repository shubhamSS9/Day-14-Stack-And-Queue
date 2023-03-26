package com.bridglabz.stack;

public class Stack<T extends Comparable<T>> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void push(T data) {
        linkedList.push(data);
    }

    public void show() {
        linkedList.show();
    }

    public T pop() {
        return linkedList.pop();
    }

    public void peek() {
        Integer peeked = (Integer) linkedList.pop();
        System.out.println("The peek element is " + peeked);
        linkedList.push((T) peeked);
    }
}
