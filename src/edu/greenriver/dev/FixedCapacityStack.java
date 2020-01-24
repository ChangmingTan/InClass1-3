package edu.greenriver.dev;

public class FixedCapacityStack<E> {
    // fields
    private E[] a;     // ref to array that holds items
    private int n;          // num items / num elements used

    // methods
    public FixedCapacityStack() {
        a = (E[]) new Object[10];     // change this later
                // create a new array of Object
                // tell the system to treat it as an array of E
                // because new E[] is not allowed :(
        n = 0;
    }

    public void push(E item) {
        a[n] = item;
        n++;
    }

    public E pop() {
        n--;
        return a[n];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

}
