package org.example;

import static java.lang.StringTemplate.STR;

public class StringTempEx {
    public static void main(String[] args) {
        String name = "John";
        String info=STR."Hello, \{name}!"; // "Hello, John!
        System.out.println(info);

    }
}
