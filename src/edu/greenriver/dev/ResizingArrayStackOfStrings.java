package edu.greenriver.dev;

public class ResizingArrayStackOfStrings {

    // fields
    private String[] a;     // ref to array that holds items
    private int n;          // num items / num elements used

    // methods
    public ResizingArrayStackOfStrings() {
        a = new String[10];     // change this later
        n = 0;
    }

    public void push(String item) {
        // check to see if the array is full
        // if it is, then double up the size
        if (n == a.length) {
            resize(2 * a.length);
        }

        a[n] = item;
        n++;
    }

    public String pop() {
        n--;
        String item = a[n];  // get + save item from the top
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
        String[] temp = new String[max];

        // copy everything from existing to new array
        for (int i = 0; i < n; i++) {
            temp[i] = a[i];
        }

        // reset the field to the new array
        a = temp;

    }

}
