package edu.greenriver.dev;

public class Stack<E> {
    // helper class
    private class Node {
        E item;
        Node next;
    }

    private class TopToBottomIterator {
        // fields??
        private Node current;

        public TopToBottomIterator() {
            current = first;
        }

        public boolean hasNext() {
            return current.next != null;
        }

        public E next() {
            E item = current.item;
            current = current.next;
            return item;
        }
    }

    // fields???
    private Node first;
    private int n;          // counter

    // methods
    public Stack() {
        first = null;
        n = 0;
    }

    public void push(E item) {
        // the diagram was from the slide
        // code is also in the book - make sure you understand
        // every line of this method and why we do all 4 lines
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        n++;
    }

    public E pop() {
        if (!isEmpty()) {
            E item = first.item;
            first = first.next;
            n--;
            return item;
        }
        return null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public int size() {
        return n;   // change this later
    }
}
