package com.bridglabz.stack;

public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.show();

        System.out.println("");
        stack.peek();
        System.out.println("");

        Integer poppedData;
        do {
            poppedData = stack.linkedList.pop();
            if (poppedData == null)
                System.out.println("Stack is Empty");
            else
                System.out.println("The element popped is => " + poppedData);
            stack.show();
        } while( poppedData != null);

    }
}
