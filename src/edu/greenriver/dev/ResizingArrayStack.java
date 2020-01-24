package edu.greenriver.dev;

import java.util.Iterator;

public class ResizingArrayStack<E> implements Iterable<E> {
    // fields
    private E[] a;     // ref to array that holds items
    private int n;          // num items / num elements used

    // methods
    public ResizingArrayStack() {
        a = (E[]) new Object[10];     // change this later
        n = 0;
    }

    public void push(E item) {
        // check to see if the array is full
        // if it is, then double up the size
        if (n == a.length) {
            resize(2 * a.length);
        }

        a[n] = item;
        n++;
    }

    public E pop() {
        n--;
        E item = a[n];  // get + save item from the top
        a[n] = null;         // clean up the now unused spot

        // check to see if I should downsize
        if (n > 0 && n == a.length / 4) {
            resize(a.length / 2);
        }

        return item;

        // the original (now commented)
        // n--;
        // return a[n];
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public int size() {
        return n;
    }

    private void resize(int max) {
        // make a new array with the new max size
        E[] temp = (E[]) new Object[max];

        // copy everything from existing to new array
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }

        // reset the field to the new array
        a = temp;

    }

    // public iterator ("get me a new iterator") method
    public Iterator<E> iterator() {
        // method creates a new TopToBottomIterator object
        // and returns its address
        return new TopToBottomIterator();
    }

    // helper class
    private class TopToBottomIterator implements Iterator<E> {
        // fields:
        // one field to keep track of the current position
        private int i;

        public TopToBottomIterator() {
            i = n - 1;
        }

        // methods:
        @Override
        public boolean hasNext() {
            return i >= 0;
        }

        @Override
        public E next() {
            E item = a[i];
            i--;
            return item;
        }
    }



}
