package edu.greenriver.dev;

public class QueueOfStrings {
    // helper classes
    private class Node {
        String item;
        Node next;
    }

    // fields
    private Node first;
    private Node last;
    private int n;

    // methods
    public QueueOfStrings() {
        first = null;
        last = null;
        n = 0;
    }

    public void enqueue(String item) {
        Node oldlast = last;        // make a copy of the last addr
        last = new Node();
        last.item = item;
        if (isEmpty()) {
            first = last;
        }
        else {
            oldlast.next = last;
        }
        n++;
    }

    public String dequeue() {
        String item = first.item;
        first = first.next;
        if (isEmpty()) {
            last = null;
        }
        n--;
        return item;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;
    }


}
