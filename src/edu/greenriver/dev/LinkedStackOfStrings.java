package edu.greenriver.dev;

public class LinkedStackOfStrings {

    // --- inner helper classes ---
    private class Node {
        String item;
        Node next;
    }

    // --- fields ---
    private Node first;
    private int N;

    // --- methods ---
    public LinkedStackOfStrings() {
        first = null;
        N = 0;
    }

    public void push(String item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }

    public String pop() {
        if (!isEmpty()) {
            String item = first.item;
            first = first.next;
            N--;
            return item;
        }

        return null;    // or return "";   or throw new NoSuchElementException();
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return N;
    }

}
