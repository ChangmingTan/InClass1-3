package edu.greenriver.dev;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        System.out.println("My stack of strings program!");

        // LinkedStackOfStrings lsos = new LinkedStackOfStrings();
        // FixedCapacityStackOfStrings lsos =
                // new FixedCapacityStackOfStrings();

        ResizingArrayStack<String> s = new ResizingArrayStack<>();
        s.push("to");
        s.push("be");
        s.push("or");
        s.push("not");

        Iterator<String> i = s.iterator();

        while (i.hasNext()) {
            String word = i.next();
            System.out.println(word);
        }

        System.out.println(s);
        System.out.println("**********");

        for (String theWord: s) {
            System.out.println(theWord);
        }
        //System.out.println(s.pop());
        //System.out.println(s.size());
    }
}
