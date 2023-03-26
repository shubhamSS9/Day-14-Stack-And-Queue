package com.bridglabz.queue;

import com.bridglabz.stack.Node;

public class Queue {
    Node front;
    Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    // Method to add an element to the Queue
    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (rear == null) {
            front = newNode;
            rear = newNode;
        } else {
            rear.setNext(newNode);
            rear = newNode;
        }
    }

    // Method to print the elements of the Queue
    public void print() {
        Node temp = front;

        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }

        System.out.println();
    }
}
