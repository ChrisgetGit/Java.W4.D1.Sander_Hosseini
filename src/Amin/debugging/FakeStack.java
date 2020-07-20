package Amin.debugging;

public class FakeStack{ // Debug: () removed from class declaration.
    // Properties
    Object[] stack;
    int top = 0; // Debug: 1 is wrong. 0 is correct: no null at index 0.
    // Constructor to initialize FakeStack object
    public FakeStack(int initSize) {
        stack = new Object[initSize];
    }
    // Method to push object after object on top of each other (first-in-last out principle)
    public void push(Object o) {
        stack[top] = o;
        top++; // Debug: missing + to icrement top
    }

    // Method to display values in Stack
    public void show() {
        for(Object n : stack) {
            System.out.print(n + " "); // Debug: extra '.' removed. ';' added.
        }
        System.out.println();
    }
    // Method to display value at index x
    public void show(int i) {
        System.out.println();
        System.out.println(stack[i]);

    }

    // Method to fetch the last value in the array (first-in-last out)
    public void pop() {
        Object data;
        top--; // Debug: -- added
        data = stack[top];
        stack[top] = null;
        System.out.println("Value fetched: " + data);
    }

}
