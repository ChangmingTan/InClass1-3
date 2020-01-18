package edu.greenriver.dev;

public class FixedCapacityStackOfStrings {

    // -- constants --
    private static final int DEFAULT_CAPACITY = 10;

    // --- fields ---
    private String[] s;
    private int N;

    // --- methods ---
    public FixedCapacityStackOfStrings() {
        s = new String[DEFAULT_CAPACITY];
        N = 0;
    }

    public void push(String item) {
        // does not check to see if we have run out of space
        s[N] = item;
        N++;
    }

    public String pop() {
        N--;
        return s[N];
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

}
