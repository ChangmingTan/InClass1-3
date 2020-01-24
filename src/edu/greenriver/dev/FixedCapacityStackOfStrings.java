package edu.greenriver.dev;

public class FixedCapacityStackOfStrings {
    // fields
    private String[] a;     // ref to array that holds items
    private int n;          // num items / num elements used

    // methods
    public FixedCapacityStackOfStrings() {
        a = new String[10];     // change this later
        n = 0;
    }

    public void push(String item) {
        a[n] = item;
        n++;
    }

    public String pop() {
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
